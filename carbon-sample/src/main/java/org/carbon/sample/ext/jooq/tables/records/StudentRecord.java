/**
 * This class is generated by jOOQ
 */
package org.carbon.sample.ext.jooq.tables.records;


import javax.annotation.Generated;

import org.carbon.sample.ext.jooq.tables.Student;
import org.carbon.sample.ext.jooq.tables.interfaces.IStudent;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.8.6"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class StudentRecord extends UpdatableRecordImpl<StudentRecord> implements Record4<Long, String, String, String>, IStudent {

    private static final long serialVersionUID = -1407389143;

    /**
     * Setter for <code>carbondb.student.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>carbondb.student.id</code>.
     */
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>carbondb.student.password</code>.
     */
    @Override
    public void setPassword(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>carbondb.student.password</code>.
     */
    @Override
    public String getPassword() {
        return (String) get(1);
    }

    /**
     * Setter for <code>carbondb.student.username</code>.
     */
    @Override
    public void setUsername(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>carbondb.student.username</code>.
     */
    @Override
    public String getUsername() {
        return (String) get(2);
    }

    /**
     * Setter for <code>carbondb.student.email</code>.
     */
    @Override
    public void setEmail(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>carbondb.student.email</code>.
     */
    @Override
    public String getEmail() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Long, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Student.STUDENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Student.STUDENT.PASSWORD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Student.STUDENT.USERNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Student.STUDENT.EMAIL;
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
        return getPassword();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getUsername();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value2(String value) {
        setPassword(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value3(String value) {
        setUsername(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord value4(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StudentRecord values(Long value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IStudent from) {
        setId(from.getId());
        setPassword(from.getPassword());
        setUsername(from.getUsername());
        setEmail(from.getEmail());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IStudent> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StudentRecord
     */
    public StudentRecord() {
        super(Student.STUDENT);
    }

    /**
     * Create a detached, initialised StudentRecord
     */
    public StudentRecord(Long id, String password, String username, String email) {
        super(Student.STUDENT);

        set(0, id);
        set(1, password);
        set(2, username);
        set(3, email);
    }
}