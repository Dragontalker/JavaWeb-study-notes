package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		System.out.println("@Servlet2 => check data... => username=" + username);
		
		Object key1 = req.getAttribute("key1");
		System.out.println(">> Approved from Servlet1? " + key1);
		
		System.out.println("@Servlet2 => business logic....");
	}

}
