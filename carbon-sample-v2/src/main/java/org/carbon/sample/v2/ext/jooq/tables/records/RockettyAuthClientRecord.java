/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.v2.ext.jooq.tables.records;


import java.time.LocalDateTime;

import javax.annotation.Generated;

import org.carbon.sample.v2.ext.jooq.tables.RockettyAuthClient;
import org.carbon.sample.v2.ext.jooq.tables.interfaces.IRockettyAuthClient;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class RockettyAuthClientRecord extends UpdatableRecordImpl<RockettyAuthClientRecord> implements Record5<Long, String, String, Boolean, LocalDateTime>, IRockettyAuthClient {

    private static final long serialVersionUID = 2093798391;

    /**
     * Setter for <code>carbondb.rocketty_auth_client.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>carbondb.rocketty_auth_client.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>carbondb.rocketty_auth_client.client_id</code>.
     */
    public void setClientId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>carbondb.rocketty_auth_client.client_id</code>.
     */
    @Override
    public String getClientId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>carbondb.rocketty_auth_client.client_secret</code>.
     */
    public void setClientSecret(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>carbondb.rocketty_auth_client.client_secret</code>.
     */
    @Override
    public String getClientSecret() {
        return (String) get(2);
    }

    /**
     * Setter for <code>carbondb.rocketty_auth_client.valid</code>.
     */
    public void setValid(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>carbondb.rocketty_auth_client.valid</code>.
     */
    @Override
    public Boolean getValid() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>carbondb.rocketty_auth_client.expire_at</code>.
     */
    public void setExpireAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>carbondb.rocketty_auth_client.expire_at</code>.
     */
    @Override
    public LocalDateTime getExpireAt() {
        return (LocalDateTime) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Boolean, LocalDateTime> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Long, String, String, Boolean, LocalDateTime> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return RockettyAuthClient.ROCKETTY_AUTH_CLIENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return RockettyAuthClient.ROCKETTY_AUTH_CLIENT.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return RockettyAuthClient.ROCKETTY_AUTH_CLIENT.CLIENT_SECRET;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return RockettyAuthClient.ROCKETTY_AUTH_CLIENT.VALID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<LocalDateTime> field5() {
        return RockettyAuthClient.ROCKETTY_AUTH_CLIENT.EXPIRE_AT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getClientSecret();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getValid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocalDateTime value5() {
        return getExpireAt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RockettyAuthClientRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RockettyAuthClientRecord value2(String value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RockettyAuthClientRecord value3(String value) {
        setClientSecret(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RockettyAuthClientRecord value4(Boolean value) {
        setValid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RockettyAuthClientRecord value5(LocalDateTime value) {
        setExpireAt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RockettyAuthClientRecord values(Long value1, String value2, String value3, Boolean value4, LocalDateTime value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    public void from(IRockettyAuthClient from) {
        setId(from.getId());
        setClientId(from.getClientId());
        setClientSecret(from.getClientSecret());
        setValid(from.getValid());
        setExpireAt(from.getExpireAt());
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RockettyAuthClientRecord
     */
    public RockettyAuthClientRecord() {
        super(RockettyAuthClient.ROCKETTY_AUTH_CLIENT);
    }

    /**
     * Create a detached, initialised RockettyAuthClientRecord
     */
    public RockettyAuthClientRecord(Long id, String clientId, String clientSecret, Boolean valid, LocalDateTime expireAt) {
        super(RockettyAuthClient.ROCKETTY_AUTH_CLIENT);

        set(0, id);
        set(1, clientId);
        set(2, clientSecret);
        set(3, valid);
        set(4, expireAt);
    }
}