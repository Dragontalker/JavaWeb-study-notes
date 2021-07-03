package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.service.BookService;
import com.dragontalker.service.impl.BookServiceImpl;

public class BookServlet extends BaseServlet {
	
	private BookService bookService = new BookServiceImpl();

	protected void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	protected void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	}
	
	protected void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	protected void list(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 通过BookService查询全部图书
		
		// 2. 把全部图书保存到Request域中
		
		// 3. 请求妆发到/pages/manager/book_manager.jsp页面
	}

}
