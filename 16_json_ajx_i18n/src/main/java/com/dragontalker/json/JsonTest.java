package com.dragontalker.json;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.dragontalker.pojo.Person;
import com.google.gson.Gson;

public class JsonTest {

	@Test
	public void test1() {
		
		Person person = new Person(1, "GuoGeHaoShuai");
		
		Gson gson = new Gson();
		
		String personJsonString = gson.toJson(person);
		
		System.out.println(personJsonString);
		
		Person personBean = gson.fromJson(personJsonString, Person.class);
		
		System.out.println(personBean);
	}
	
	@Test
	public void test2() {
		
		List<Person> personList = new ArrayList<Person>();
		
		personList.add(new Person(1, "GuoGe"));
		personList.add(new Person(2, "KangShiFu"));
		
		Gson gson = new Gson();
		
		String personListJsonString = gson.toJson(personList);
		
		System.out.println(personListJsonString);
	}
	
}
