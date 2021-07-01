package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class HelloServlet implements Servlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		
		String method = httpServletRequest.getMethod();
		
		if ("GET".equals(method)) {
			doGet();
		} else if ("POST".equals(method)) {
			doPost();
		}

	}
	
	private void doGet() {
		System.out.println("GET request called.");
		System.out.println("GET request called..");
		System.out.println("GET request called...");
	}
	
	private void doPost() {
		System.out.println("POST request called.");
		System.out.println("POST request called..");
		System.out.println("POST request called...");
	}

}
