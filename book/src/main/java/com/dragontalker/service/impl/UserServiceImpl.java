package com.dragontalker.service.impl;

import com.dragontalker.dao.UserDao;
import com.dragontalker.dao.impl.UserDaoImpl;
import com.dragontalker.pojo.User;
import com.dragontalker.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();

	@Override
	public void registerUser(User user) {
		userDao.saveUser(user);

	}

	@Override
	public User login(User user) {
		return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

	@Override
	public boolean existsUsername(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}
