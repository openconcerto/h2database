/*
 * Copyright 2004-2014 H2 Group. Multiple-Licensed under the MPL 2.0,
 * and the EPL 1.0 (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.jdbc;

import java.sql.SQLException;

/**
 * Allows us to compile on older platforms, while still implementing the methods
 * from the newer JDBC API.
 */
public interface JdbcStatementBackwardsCompat {

    // compatibility interface

    // JDBC 4.2

    long getLargeUpdateCount() throws SQLException;

    void setLargeMaxRows(long max) throws SQLException;

    long getLargeMaxRows() throws SQLException;

    long[] executeLargeBatch() throws SQLException;

    long executeLargeUpdate(String sql) throws SQLException;

    long executeLargeUpdate(String sql, int autoGeneratedKeys) throws SQLException;

    long executeLargeUpdate(String sql, int columnIndexes[]) throws SQLException;

    long executeLargeUpdate(String sql, String columnNames[]) throws SQLException;

    // JDBC 4.3 (incomplete)

    String enquoteIdentifier(String identifier, boolean alwaysQuote) throws SQLException;

    boolean isSimpleIdentifier(String identifier) throws SQLException;
}
