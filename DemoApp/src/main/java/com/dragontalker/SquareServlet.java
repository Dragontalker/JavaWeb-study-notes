package com.dragontalker;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	private static final long serialVersionUID = -8187724828753586728L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int k = 0;
		
		Cookie[] cookies = req.getCookies();
		
		for (Cookie cookie : cookies) {
			
			if ("k".equals(cookie.getName())) {
				k = Integer.parseInt(cookie.getValue());
			}
		}
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		
		out.println(">> Result is " + k);
		
	}
	
		
		
}
