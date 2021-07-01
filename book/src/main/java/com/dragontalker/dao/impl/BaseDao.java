package com.dragontalker.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.dragontalker.utils.JdbcUtils;

public abstract class BaseDao {
	
	private QueryRunner queryRunner = new QueryRunner();
	
	public int update(String sql, Object ...args) {
		
		Connection connection = JdbcUtils.getConnection();
		
		try {
			return queryRunner.update(connection, sql, args);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return -1;
		
	}
	
}
