package com.dragontalker.dao;

import com.dragontalker.pojo.User;

public interface UserDao {

	/**
	 * 根据用户名查询用户信息
	 * @param username 用户名
	 * @return 如果返回null, 说明没有这个用户, 反之亦然
	 */
	public User queryUserByUsername(String username);
	
}
