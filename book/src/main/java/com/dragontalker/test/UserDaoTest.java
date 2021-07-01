package com.dragontalker.test;

import org.junit.Test;

import com.dragontalker.dao.UserDao;
import com.dragontalker.dao.impl.UserDaoImpl;

public class UserDaoTest {

	@Test
	public void testQueryUserByUsername() {
		UserDao userDao = new UserDaoImpl();
		System.out.println(userDao.queryUserByUsername("admin"));
	}
}
