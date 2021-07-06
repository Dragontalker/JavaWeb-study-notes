package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = -5766922838816592380L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if ("wzg168".equals(username) && "123456".equals(password)) {
			req.getSession().setAttribute("user", username);
			resp.getWriter().write("Login Successful!");
		} else {
			req.getRequestDispatcher("/login.jsp").forward(req, resp);
		}
	}
	
	

}
