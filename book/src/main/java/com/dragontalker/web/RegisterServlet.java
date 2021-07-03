package com.dragontalker.web;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
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
		String email = req.getParameter("email");
		String code	= req.getParameter("code");
		
		if ("abcde".equalsIgnoreCase(code)) {
			
			if (userService.existsUsername(username)) {
				// 把回显信息, 保存到request域中
				req.setAttribute("msg", "验证码错误!");
				req.setAttribute("username", username);
				req.setAttribute("email", email);
				
				System.out.println("用户名[" + username +"]已存在!");
				req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
			} else {
				userService.registerUser(new User(null, username, password, email));
				req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
			}
			
		} else {
			// 把回显信息, 保存到request域中
			req.setAttribute("msg", "验证码错误!");
			req.setAttribute("username", username);
			req.setAttribute("email", email);
			
			System.out.println("验证码[" + code + "]错误!");
			req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
		}
	}
	
}
