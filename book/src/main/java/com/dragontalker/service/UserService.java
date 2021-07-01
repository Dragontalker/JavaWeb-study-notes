package com.dragontalker.service;

import com.dragontalker.pojo.User;

public interface UserService {
	
	public void registerUser(User user);
	
	public User login(User user);
	
	public boolean existsUsername(String username);

}
