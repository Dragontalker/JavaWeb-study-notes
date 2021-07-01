package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet1 extends HttpServlet {

	private static final long serialVersionUID = 277148871386430658L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		
		context.setAttribute("key1", "value1");
		
		System.out.println("Context1: value of key1: " + context.getAttribute("key1"));
	}
	
	
}
