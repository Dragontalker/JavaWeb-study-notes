package com.dragontalker.test;

import org.junit.Test;

import com.dragontalker.pojo.User;
import com.dragontalker.service.UserService;
import com.dragontalker.service.impl.UserServiceImpl;

public class UserDaoImplTest {
	
	UserService userService = new UserServiceImpl();

	@Test
	public void testRegisterUser() {
		userService.registerUser(new User(null, "bbj168", "666666", "bbj168@qq.com"));
		userService.registerUser(new User(null, "abc168", "666666", "abc168@qq.com"));
	}
	
	@Test
	public void testLogin() {
		if (userService.login(new User(null, "bbj168", "666666", null)) == null) {
			System.out.println("登录失败!");
		} else {
			System.out.println("登录成功!");
		}
	}
}
