package com.dragontalker.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrintHtml extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter writer = resp.getWriter();
		
		writer.write("<!DOCTYPE html>\r\n");
		writer.write("<html>\r\n");
		writer.write("<head>\r\n");
		writer.write("<meta charset=\"UTF-8\">\r\n");
		writer.write("<title>Insert title here</title>\r\n");
		writer.write("</head>\r\n");
		writer.write("<body>\r\n");
		writer.write("这里是html页面\r\n");
		writer.write("</body>\r\n");
		writer.write("</html>\r\n");
	}
	
}
