package com.dragontalker.pojo;

public class User {
	
	private Integer idInteger;
	private String username;
	private String password;
	private String email;

	public User() {}

	public User(Integer idInteger, String username, String password, String email) {
		this.idInteger = idInteger;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
}
