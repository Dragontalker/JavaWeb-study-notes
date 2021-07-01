package com.dragontalker.test;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;
import com.dragontalker.utils.*;

public class JdbcUtilsTest {
	
	@Test
	public void testJdbcUltis() {
		
		for (int i = 0; i < 100; i++) {
			Connection connection = JdbcUtils.getConnection();
			System.out.println(">> " + (i + 1) + "th connection: " + connection);
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
