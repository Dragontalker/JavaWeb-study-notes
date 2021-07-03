package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.User;
import com.dragontalker.service.UserService;
import com.dragontalker.service.impl.UserServiceImpl;

public class LoginServlet extends HttpServlet {
	
	private UserService userService = new UserServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username	= req.getParameter("username");
		String password	= req.getParameter("password");
		
		if (userService.existsUsername(username)) {
			
			User loginUser = userService.login(new User(null, username, password, null));
			
			if (loginUser != null ) {
				System.out.println("登录成功!");
				req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req, resp);
			} else {
				System.out.println("密码错误!");
				req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
			}
			
		} else {
			System.out.println("用户名[" + username +"]不存在!");
			req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
		}
	}

}
