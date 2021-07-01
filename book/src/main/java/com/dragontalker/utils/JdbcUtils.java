package com.dragontalker.utils;

import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import jdk.internal.dynalink.beans.StaticClass;

public class JdbcUtils {
	
	private static DruidDataSource dataSource;
	
	static {

		try {
			Properties properties = new Properties();
			
			InputStream inputStream = 
					JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
			
			properties.load(inputStream);
			
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
