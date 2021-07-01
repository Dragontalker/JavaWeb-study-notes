package com.dragontalker.utils;

import java.sql.Connection;

import com.alibaba.druid.pool.DruidDataSource;

import jdk.internal.dynalink.beans.StaticClass;

public class JdbcUtils {
	
	private static DruidDataSource dataSource;
	
	static {
		
	}

	public static Connection getConnection() {
		
		return null;
	}
	
	public static void close(Connection conn) {
		
	}
	
}
