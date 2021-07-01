package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		System.out.println("@Servlet1 => check data... => username=" + username);
		
		req.setAttribute("key", "Servlet1 Approved");
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/servlet2");
		
		requestDispatcher.forward(req, resp);
	}

}
