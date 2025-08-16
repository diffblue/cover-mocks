/*
 * Copyright 2025 Diffblue Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.diffblue.cover.mocks.sql;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

/**
 * A mock implementation of {@link ResultSetMetaData} that provides basic functionality for testing
 * purposes. Returned by {@link MockResultSet#getMetaData()}.
 */
class MockResultSetMetaData implements ResultSetMetaData {

  /** List of column names */
  private final List<String> columnNames;

  MockResultSetMetaData(List<String> columnNames) {
    this.columnNames = columnNames;
  }

  @Override
  public int getColumnCount() throws SQLException {
    return columnNames.size();
  }

  @Override
  public boolean isAutoIncrement(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public boolean isCaseSensitive(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public boolean isSearchable(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public boolean isCurrency(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public int isNullable(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public boolean isSigned(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public int getColumnDisplaySize(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public String getColumnLabel(int column) throws SQLException {
    return "";
  }

  @Override
  public String getColumnName(int column) throws SQLException {
    // columns are 1-indexed in JDBC, so we need to subtract 1
    return columnNames.get(column - 1);
  }

  @Override
  public String getSchemaName(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public int getPrecision(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public int getScale(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public String getTableName(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public String getCatalogName(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public int getColumnType(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public String getColumnTypeName(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public boolean isReadOnly(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public boolean isWritable(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public boolean isDefinitelyWritable(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public String getColumnClassName(int column) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public <T> T unwrap(Class<T> iface) throws SQLException {
    throw new RuntimeException("Not implemented");
  }

  @Override
  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    throw new RuntimeException("Not implemented");
  }
}
