package com.dragontalker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseIOServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println(">> Original Encoding:" + resp.getCharacterEncoding());
		
		//resp.setCharacterEncoding("UTF-8");
		
		//resp.setHeader("Content-Type", "text/html; charset=UTF-8");
		
		resp.setContentType("text/html; charset=UTF-8");
		
		System.out.println(">> New Encoding:" + resp.getCharacterEncoding());
		
		PrintWriter writer = resp.getWriter();
		writer.write(">> Response content!! ==> 国哥很神！");
		
		
	}

}
