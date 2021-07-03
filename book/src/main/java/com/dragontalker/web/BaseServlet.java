package com.dragontalker.web;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class BaseServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		try {
			Method method = this.getClass()
					.getDeclaredMethod(action, 
							HttpServletRequest.class, 
							HttpServletResponse.class);
			
			method.invoke(this, req, resp);
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
}
