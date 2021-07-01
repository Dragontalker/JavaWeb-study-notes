package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ContextServlet extends HttpServlet {

	private static final long serialVersionUID = 277148871386430658L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext context = getServletConfig().getServletContext();
		
		String username = context.getInitParameter("username");
		String password = context.getInitParameter("password");
		
		System.out.println(">> Servlet-context: username=" + username);
		System.out.println(">> Servlet-context: password=" + password);
		
		System.out.println(">> Context-path: " + context.getContextPath());
		
		System.out.println(">> Real-path: " + context.getRealPath("/"));
	}
	
	
}
