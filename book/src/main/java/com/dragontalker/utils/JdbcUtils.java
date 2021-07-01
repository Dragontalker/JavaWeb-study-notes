package com.dragontalker.utils;

import java.sql.Connection;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import jdk.internal.dynalink.beans.StaticClass;

public class JdbcUtils {
	
	private static DruidDataSource dataSource;
	
	static {
		Properties properties = null;
		
		try {
			
			dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		
		return null;
	}
	
	public static void close(Connection conn) {
		
	}
	
}
