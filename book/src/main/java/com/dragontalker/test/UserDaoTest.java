package com.dragontalker.test;

import org.junit.Test;

import com.dragontalker.dao.UserDao;
import com.dragontalker.dao.impl.UserDaoImpl;

public class UserDaoTest {

	@Test
	public void testQueryUserByUsername() {
		UserDao userDao = new UserDaoImpl();
		if (userDao.queryUserByUsername("admin") == null) {
			System.out.println("用户名可用!");
		} else {
			System.out.println("用户名已存在...");
		}
	}
	
	@Test
	public void testQueryUserByUsernameAndPassword() {
		UserDao userDao = new UserDaoImpl();
		if (userDao.queryUserByUsernameAndPassword("admin", "admin") == null) {
			System.out.println("用户名或密码错误, 登录失败!");
		} else {
			System.out.println("查询成功!");
		}
	}
}
