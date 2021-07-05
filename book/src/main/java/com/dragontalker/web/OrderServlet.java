package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.Cart;
import com.dragontalker.pojo.User;

public class OrderServlet extends BaseServlet{

	private static final long serialVersionUID = 4805187894608075566L;

	protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 先获取Cart购物车对象
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		
		// 获取UserId
		User loginUser = (User) req.getSession().getAttribute("user");
		
	}

	
}
