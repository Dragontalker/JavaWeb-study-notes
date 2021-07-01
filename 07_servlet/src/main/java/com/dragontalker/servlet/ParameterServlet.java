package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParameterServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String userName = req.getParameter("username");
		String password = req.getParameter("password");
		String hobby = req.getParameter("hobby");
		
		System.out.println(">> User Name=" + userName);
		System.out.println(">> Password=" + password);
		System.out.println(">> Hobby=" + hobby);
	}

	
}
