package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestAPIServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("URI => " + req.getRequestURI());
		
		System.out.println("URL => " + req.getRequestURL());
		
		System.out.println("Client IP Address => " + req.getRemoteHost());
		
		System.out.println("Header>>User Agent => " + req.getHeader("User-Agent"));
	}

	
}
