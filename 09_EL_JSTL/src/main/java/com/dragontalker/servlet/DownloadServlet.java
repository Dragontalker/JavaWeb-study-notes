package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DownloadServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 1. 获取要下载的文件名
		String downloadFileName = "2.jpg";
		
		// 2. 读取要下载的文件内容(通过ServletContext对象可以读取)
		ServletContext servletContext = getServletContext();
		/**
		 * /斜杆被服务器解析表示地址为http://ip:port/工程名/ 映射 到代码的web目录
		 */
		servletContext.getResourceAsStream("/file/");
	}
	
	
}
