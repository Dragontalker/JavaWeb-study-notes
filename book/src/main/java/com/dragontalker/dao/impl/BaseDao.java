package com.dragontalker.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

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
	
}
