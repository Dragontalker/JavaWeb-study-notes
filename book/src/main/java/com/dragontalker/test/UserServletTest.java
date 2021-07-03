package com.dragontalker.test;

import java.lang.reflect.Method;

import org.apache.jasper.compiler.NewlineReductionServletWriter;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class UserServletTest {
	
	public void login() {
		System.out.println(">> login() called...");
	}
	
	public void regist() {
		System.out.println(">> regist() called...");
	}
	
	public void updateUser() {
		System.out.println(">> updateUser() called...");
	}
	
	public void updateUserAndPassword() {
		System.out.println(">> updateUserAndPassword() called...");
	}
	
	public static void main(String[] args) {
		
		String action = "login";
		
		try {
			Method method = UserServletTest.class.getDeclaredMethod(action);
			
			System.out.println(method);
			
			method.invoke(new UserServletTest());
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	
}
