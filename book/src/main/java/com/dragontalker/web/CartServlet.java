package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CartServlet extends BaseServlet {

	protected void addItem(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.err.println("加入购物车...");
	}

	
}
