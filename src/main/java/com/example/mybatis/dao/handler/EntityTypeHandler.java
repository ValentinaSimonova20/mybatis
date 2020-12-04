package com.example.mybatis.dao.handler;

import org.apache.ibatis.executor.result.ResultMapException;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class EntityTypeHandler<T> extends BaseTypeHandler<T> {
	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
		ps.setObject(i, parameter);
	}

	@Override
	public T getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return createEntity(rs);
	}

	@Override
	public T getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
		return createEntity(rs);
	}

	@Override
	public T getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
		return (T) cs.getObject(columnIndex);
	}

	public T getResult(ResultSet rs, String columnName) {
		T result;
		try {
			result = getNullableResult(rs, columnName);
		} catch (Exception e) {
			throw new ResultMapException("Error attempting to get column '" + columnName + "' from result set.  Cause: " + e, e);
		}
		return result;
	}

	public T getResult(ResultSet rs, int columnIndex) throws SQLException {
		T result;
		try {
			result = getNullableResult(rs, columnIndex);
		} catch (Exception e) {
			throw new ResultMapException("Error attempting to get column #" + columnIndex + " from result set.  Cause: " + e, e);
		}

		return result;

	}

	public T getResult(CallableStatement cs, int columnIndex) throws SQLException {
		T result;
		try {
			result = getNullableResult(cs, columnIndex);
		} catch (Exception e) {
			throw new ResultMapException("Error attempting to get column #" + columnIndex + " from callable statement.  Cause: " + e, e);
		}

		return result;

	}

	public abstract T createEntity(ResultSet resultSet) throws SQLException;

}
