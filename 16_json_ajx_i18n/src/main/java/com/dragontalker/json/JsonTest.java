package com.dragontalker.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;

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
		
		List<Person> personListFromJson = 
				gson.fromJson(personListJsonString, new TypeToken<List<Person>>(){}.getType());
		
		System.out.println(personListFromJson);
	}
	
	@Test
	public void test3() {
		
		Map<Integer, Person> personMap = new HashMap<>();
		
		personMap.put(1,  new Person(1, "GuoGeHaoShuai"));
		personMap.put(2,  new Person(2, "KangShiFuYeHaoShuai"));
		
		Gson gson = new Gson();
		
		String personMapJsonString = gson.toJson(personMap);
		
		System.out.println(personMapJsonString);
		
		Map<Integer, Person> personMapFromJson = 
				gson.fromJson(personMapJsonString, new TypeToken<Map<Integer, Person>>(){}.getType());
		
		System.out.println(personMapFromJson);
	}
	
}
