package com.dragontalker.pojo;

import java.util.List;
import java.util.Map;

public class Person {

	private String name;
	private String[] phone;
	private List<String> cities;
	private Map<String, String> map;
	
	public Person() {}

	public Person(String name, String[] phone, List<String> cities, Map<String, String> map) {
		super();
		this.name = name;
		this.phone = phone;
		this.cities = cities;
		this.map = map;
	}
	
}
