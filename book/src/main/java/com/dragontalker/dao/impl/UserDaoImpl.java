package com.dragontalker.dao.impl;

import com.dragontalker.dao.UserDao;
import com.dragontalker.pojo.User;

public class UserDaoImpl extends BaseDao implements UserDao {

	@Override
	public User queryUserByUsername(String username) {
		String sql = "select `id`, `username`, `password`, `email` from `t_user` where `username` = ?";
		return queryForOne(User.class, sql, username);
	}

	@Override
	public User queryUserByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int saveUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
