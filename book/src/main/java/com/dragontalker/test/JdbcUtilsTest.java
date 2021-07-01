package com.dragontalker.test;

import org.junit.Test;
import com.dragontalker.utils.*;

public class JdbcUtilsTest {
	
	@Test
	public void testJdbcUltis() {
		
		for (int i = 0; i < 100; i++) {
			System.out.println(">> " + (i + 1) + "th connection: " + JdbcUtils.getConnection());
		}
		
	}

}
