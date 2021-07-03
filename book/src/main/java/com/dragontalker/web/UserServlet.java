package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.User;
import com.dragontalker.service.UserService;
import com.dragontalker.service.impl.UserServiceImpl;

public class UserServlet extends HttpServlet {
	
	private UserService userService = new UserServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String action = req.getParameter("action");
		
		if ("login".equals(action)) {
			
	        String username = req.getParameter("username");
	        String password = req.getParameter("password");

	        User loginUser = userService.login(new User(null, username, password, null));

	        if (loginUser == null) {
	        	
	            req.setAttribute("msg","用户或密码错误！");
	            req.setAttribute("username", username);
	            
	            req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
	            
	        } else {
	        	
	            req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req, resp);
	            
	        }
		} else if ("regist".equals(action)) {
			
		}
	}

}
