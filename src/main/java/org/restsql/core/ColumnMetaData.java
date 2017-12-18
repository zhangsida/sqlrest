/* Copyright (c) restSQL Project Contributors. Licensed under MIT. */
package org.restsql.core;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.restsql.core.TableMetaData.TableRole;

/**
 * Encapsulates column (or field) metadata of an SQL Resource.
 * 
 * @author Mark Sawers
 * @see SqlResource
 * @see TableMetaData
 */
public interface ColumnMetaData extends Comparable<ColumnMetaData> {

	/**
	 * Compares another column based on the column number of the select clause in the SQL Resource definition query.
	 * Implements Comparable interface.
	 */
	public int compareTo(ColumnMetaData column);

	/**
	 * Returns column label, a string identified in double quotes after columns in the select clause in the SQL Resource
	 * definition query.
	 */
	public String getColumnLabel();

	/** Returns column name, as it is known by the database. */
	public String getColumnName();

	/** Returns column number in the select clause in the SQL Resource definition query. */
	public int getColumnNumber();

	/**
	 * Returns column type from java.sql.Types.
	 * 
	 * @return java.sql.Types constant
	 * @see java.sql.Types
	 */
	public int getColumnType();

	/** Returns column type name as given by the database JDBC driver. */
	public String getColumnTypeName();

	/** Returns database name. */
	public String getDatabaseName();

	/**
	 * Returns fully qualified column label in database-specific form for use in SQL statements. MySQL uses the form
	 * <code>database.table.label</code>, for example <code>sakila.film.id</code>. PostgreSQL can only use
	 * <code>label</code> and cannot disambiguate by table source.
	 */
	public String getQualifiedColumnLabel();

	/**
	 * Returns fully qualified column name in database-specific form for use in SQL statements. MySQL uses the form
	 * <code>database.table.column</code>, for example <code>sakila.film.film_id</code>. PostgreSQL uses the form
	 * <code>database.schema.table.column</code>, for example <code>sakila.public.film.film_id</code>.
	 */
	public String getQualifiedColumnName();

	/**
	 * Returns fully qualified table name in database-specific form for use in SQL statements. MySQL uses the form
	 * <code>database.table</code>, for example <code>sakila.film</code>. PostgreSQL uses the form
	 * <code>database.schema.table</code>, for example <code>sakila.public.film</code>.
	 */
	public String getQualifiedTableName();

	/** Returns object from result set using the column label. */
	public Object getResultByLabel(ResultSet resultSet) throws SQLException;

	/** Returns object from result set using the column number. */
	public Object getResultByNumber(ResultSet resultSet) throws SQLException;

	/** Returns sequence name associated with column or null if none. For MySQL, returns table name. */
	public String getSequenceName();

	/** Returns table name. */
	public String getTableName();

	/** Returns role of table in the SQL Resource. */
	public TableRole getTableRole();

	/** Returns true if type is BINARY, BLOB, JAVA OBJECT or LONGVARBINARY. */
	public boolean isBinaryType();

	/** Returns true if column is a character string or date, time or timestamp. */
	public boolean isCharOrDateTimeType();

	/**
	 * Returns true for foreign key columns not declared in the SQL Resource query but added by the framework. These are
	 * required for writes to child extensions, parent extensions and and one-to-many child tables.
	 */
	public boolean isNonqueriedForeignKey();

	/** Returns true if the column is a primary key. */
	public boolean isPrimaryKey();

	/** Returns true if the column is read-only, for example derived from SQL function or a database view. */
	public boolean isReadOnly();

	/**
	 * Returns true if column is associated with a sequence.
	 * 
	 * @see #getSequenceName()
	 */
	public boolean isSequence();

	/**
	 * Converts String value to a numeric Object, Date or UUDecode String into Object if required using the column
	 * metadata.
	 * 
	 * @param requestValue parameter or resource identifier
	 * @throws InvalidRequestException if conversion failed
	 */
	public void normalizeValue(final RequestValue requestValue) throws InvalidRequestException;

	/**
	 * Used for all columns declared in the SqlResource select clause.
	 */
	public void setAttributes(final int columnNumber, final String databaseName,
			final String qualifiedTableName, final String tableName, final String columnName,
			final String qualifiedColumnName, final String columnLabel, final String qualifiedColumnLabel,
			final String columnTypeName, final int columnType, final boolean readOnly);

	/**
	 * Used for foreign key columns not declared in the SqlResource select columns. These are required for writes to
	 * child extensions, parent extensions and child tables.
	 */
	public void setAttributes(final String databaseName, final String sqlQualifiedTableName,
			final String tableName, final TableRole tableRole, final String columnName,
			final String qualifiedColumnName, final String columnLabel, final String qualifiedColumnLabel,
			final String columnTypeString);
	
	/** Sets primary key. */
	public void setPrimaryKey(final boolean primaryKey);

	/** Sets true if column populated with a sequence function (auto increment). */
	public void setSequence(final boolean sequence);

	/** Sets sequence name. */
	public void setSequenceName(final String sequenceName);

	/** Sets table role. */
	public void setTableRole(final TableRole tableRole);
}