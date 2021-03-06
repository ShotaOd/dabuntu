package org.carbon.authentication;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.carbon.authentication.exception.AccessProhibitedException;
import org.carbon.authentication.exception.AuthenticationException;
import org.carbon.authentication.exception.IllegalAuthenticationRequestException;
import org.carbon.authentication.exception.IllegalIdentityException;
import org.carbon.authentication.exception.IllegalSecretException;
import org.carbon.authentication.exception.event.AuthenticationExpiredEvent;
import org.carbon.authentication.strategy.AuthStrategy;
import org.carbon.authentication.strategy.AuthStrategyContext;
import org.carbon.authentication.strategy.request.AuthRequest;
import org.carbon.component.annotation.Assemble;
import org.carbon.component.annotation.Component;
import org.carbon.web.context.request.RequestPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Shota Oda 2016/10/27.
 */
@Component
public class DefaultAuthenticator implements Authenticator {

    private Logger logger = LoggerFactory.getLogger(DefaultAuthenticator.class);

    @Assemble
    private AuthStrategyContext authStrategyContext;
    @Assemble
    private RequestPool requestPool;

    /**
     * {@inheritDoc}
     */
    @Override
    public void authenticate(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        logger.debug("[start  ] -> request: {}", request.getPathInfo());

        // -----------------------------------------------------
        //                                               Check where Security need or not
        //                                               -------
        if (!authStrategyContext.existSecurity()) {
            logger.debug("[end    ] -> No Security in web app");
            return;
        }

        // -----------------------------------------------------
        //                                               Find Security Strategy
        //                                               -------
        Optional<AuthStrategy> strategyOp = authStrategyContext.findStrategy(request, response);

        if (!strategyOp.isPresent()) {
            logger.debug("[end    ] -> No Security Strategy found");
            return;
        }
        AuthStrategy strategy = strategyOp.get();
        logger.debug("[process] -> Found Strategy: {}", strategy);
        requestPool.setObject(strategy);

        // -----------------------------------------------------
        //                                               Check Permit Region or not
        //                                               -------
        if (strategy.shouldPermitNoAuth()) {
            logger.debug("[end    ] -> Permit caz no need authentication");
            strategy.onPermitNoAuth();
            return;
        }

        // -----------------------------------------------------
        //                                               Expire check
        //                                               -------
        if (strategy.shouldExpire()) {
            logger.debug("[end    ] -> Expire Success");
            throw new AuthenticationExpiredEvent();
        }

        // -----------------------------------------------------
        //                                               Check session
        //                                               -------
        if (strategy.existSession()) {
            logger.debug("[end    ] -> Auth Success; Exist Authorized Identity");
            strategy.onExistSession();
            return;
        }

        // -----------------------------------------------------
        //                                               Check should try auth or not
        //                                               -------
        if (!strategy.shouldTryAuth()) {
            throw new AccessProhibitedException();
        }

        // -----------------------------------------------------
        //                                               Try Auth
        //                                               -------
        logger.debug("[process] -> start try auth");
        Optional<AuthRequest> authInfOp = strategy.mapRequest();
        if (!authInfOp.isPresent()) {
            logger.debug("[end    ] -> Failed to auth, Not Found request info");
            throw new IllegalAuthenticationRequestException();
        }

        // request-base Auth info
        AuthRequest authRequest = authInfOp.get();

        // defined Auth info
        Optional<? extends AuthIdentity> authIdentityOp = strategy.find(authRequest);
        if (!authIdentityOp.isPresent()) {
            logger.debug("[end    ] -> Failed to auth, Not found identityClass for request: '{}'", authRequest);
            throw new IllegalIdentityException();
        }

        AuthIdentity authIdentity = authIdentityOp.get();
        boolean authSuccess = authIdentity.confirm(authRequest.getSecret());
        if (authSuccess) {
            logger.debug("[end    ] -> Success Login; Auth Identity: {}", authIdentity.getClass());
            strategy.onAuth(authIdentity);
        } else {
            logger.debug("[end    ] -> Failed to auth: for identityClass'{}'", authIdentity);
            throw new IllegalSecretException();
        }
    }
}
