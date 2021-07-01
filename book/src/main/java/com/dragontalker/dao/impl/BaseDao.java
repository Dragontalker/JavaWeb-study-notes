package com.dragontalker.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.dragontalker.utils.JdbcUtils;

public abstract class BaseDao {
	
	private QueryRunner queryRunner = new QueryRunner();
	
	public int update(String sql, Object ...args) {
		
		Connection connection = JdbcUtils.getConnection();
		
		try {
			return queryRunner.update(connection, sql, args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(connection);
		}
		
		return -1;
		
	}
	
	public <T> T  queryForOne(Class<T> type, String sql, Object ... args) {
		
		Connection connection = JdbcUtils.getConnection();
		
		try {
			return queryRunner.query(connection, sql, new BeanHandler<T>(type), args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(connection);
		}
		
		return null;
		
	}
	
	public <T> List<T> queryForList(Class<T> type, String sql, Object ... args) {
		
		Connection connection = JdbcUtils.getConnection();
		
		try {
			return queryRunner.query(connection, sql, new BeanListHandler<T>(type), args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(connection);
		}
		
		return null;
		
	}
	
	public Object queryForSingleValue(String sql, Object ... args ) {
		
		Connection connection = JdbcUtils.getConnection();
		
		try {
			return queryRunner.query(connection, sql, new ScalarHandler(), args);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtils.close(connection);
		}
		
		return null;
	}
	
}
