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

	public Integer getIdInteger() {
		return idInteger;
	}

	public void setIdInteger(Integer idInteger) {
		this.idInteger = idInteger;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [idInteger=" + idInteger + ", username=" + username + ", password=" + password + ", email=" + email
				+ "]";
	}
	
}
