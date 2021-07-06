package com.dragontalker.json;

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
	}
	
}
