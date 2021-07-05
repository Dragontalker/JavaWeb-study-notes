package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.Cart;
import com.dragontalker.pojo.User;
import com.dragontalker.service.OrderService;
import com.dragontalker.service.impl.OrderServiceImpl;

public class OrderServlet extends BaseServlet{

	private static final long serialVersionUID = 4805187894608075566L;
	
	private OrderService orderService = new OrderServiceImpl();

	protected void createOrder(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 先获取Cart购物车对象
		Cart cart = (Cart) req.getSession().getAttribute("cart");
		
		// 获取UserId
		User loginUser = (User) req.getSession().getAttribute("user");
		
		if (loginUser == null) {
			req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
			return;
		}
		
		Integer userId = loginUser.getId();
		
		String orderId = orderService.createOrder(cart, userId);
		
		req.getSession().setAttribute("orderId", orderId);
		
		// 请求妆发到/pages/cart/checkout.jsp
		resp.sendRedirect(req.getContextPath() +"/pages/cart/checkout.jsp");
	}

	
}
