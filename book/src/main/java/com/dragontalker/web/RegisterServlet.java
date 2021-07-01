package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.User;
import com.dragontalker.service.UserService;
import com.dragontalker.service.impl.UserServiceImpl;

public class RegisterServlet extends HttpServlet {
	
	private UserService userService = new UserServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username	= req.getParameter("username");
		String password	= req.getParameter("password");
		String email	= req.getParameter("email");
		String code	= req.getParameter("code");
		
		if ("abcde".equalsIgnoreCase(code)) {
			
			if (userService.existsUsername(username)) {
				System.out.println("用户名[" + username +"]已存在!");
				req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
			} else {
				userService.registerUser(new User(null, username, password, email));
				req.getRequestDispatcher("/pages/user/regist_success.html").forward(req, resp);
			}
			
		} else {
			System.out.println("验证码[" + code + "]错误!");
			req.getRequestDispatcher("/pages/user/regist.html").forward(req, resp);
		}
	}
	
}
