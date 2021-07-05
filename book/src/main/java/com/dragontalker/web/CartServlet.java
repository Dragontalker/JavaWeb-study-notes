package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.service.BookService;
import com.dragontalker.service.impl.BookServiceImpl;
import com.dragontalker.utils.WebUltis;

public class CartServlet extends BaseServlet {
	
	private BookService bookService = new BookServiceImpl();

	protected void addItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = WebUltis.parseInt(req.getParameter("id"), 0);
		
		System.out.println(id);
	}

	
}
