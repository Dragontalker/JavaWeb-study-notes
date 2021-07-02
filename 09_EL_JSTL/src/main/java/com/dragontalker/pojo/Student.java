package com.dragontalker.pojo;

public class Student {
	
	private Integer id;
	private String username;
	private String password;
	private Integer age;
	private String phone;

	public Student() {}

	public Student(Integer id, String username, String password, Integer age, String phone) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.phone = phone;
	}
	
}
