package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		if ("login".equals(action)) {
			
		} else if ("regist".equals(action)) {
			
		}
	}

}
