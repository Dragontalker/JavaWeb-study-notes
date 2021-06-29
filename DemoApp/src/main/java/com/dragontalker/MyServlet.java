package com.dragontalker;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	private static final long serialVersionUID = 7745025973720938867L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		PrintWriter out = response.getWriter();
		out.print("Hi<br>");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("name");
		out.print(str);
		
	}

}
