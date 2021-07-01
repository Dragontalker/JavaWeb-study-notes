package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Response1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("I was here!! @Response1");
		
		resp.setStatus(302);
		resp.setHeader("Location", "http://localhost:8080/07_servlet/response2");
	}

	
}
