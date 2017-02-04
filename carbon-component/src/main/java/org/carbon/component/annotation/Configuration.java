package org.carbon.component.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * For produce Component by Method
 * assert using with @Component in Method
 * and this annotated class is also resolved @Inject
 * @see Component
 * @author Shota Oda 2016/10/15.
 */
@Component
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Configuration {
}
