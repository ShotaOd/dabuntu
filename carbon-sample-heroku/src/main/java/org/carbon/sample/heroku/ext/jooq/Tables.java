/*
 * This file is generated by jOOQ.
*/
package org.carbon.sample.heroku.ext.jooq;


import javax.annotation.Generated;

import org.carbon.sample.heroku.ext.jooq.tables.Blog;
import org.carbon.sample.heroku.ext.jooq.tables.SchemaVersion;
import org.carbon.sample.heroku.ext.jooq.tables.Todo;
import org.carbon.sample.heroku.ext.jooq.tables.User;


/**
 * Convenience access to all tables in carbon
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>carbon.blog</code>.
     */
    public static final Blog BLOG = org.carbon.sample.heroku.ext.jooq.tables.Blog.BLOG;

    /**
     * The table <code>carbon.schema_version</code>.
     */
    public static final SchemaVersion SCHEMA_VERSION = org.carbon.sample.heroku.ext.jooq.tables.SchemaVersion.SCHEMA_VERSION;

    /**
     * The table <code>carbon.todo</code>.
     */
    public static final Todo TODO = org.carbon.sample.heroku.ext.jooq.tables.Todo.TODO;

    /**
     * The table <code>carbon.user</code>.
     */
    public static final User USER = org.carbon.sample.heroku.ext.jooq.tables.User.USER;
}
