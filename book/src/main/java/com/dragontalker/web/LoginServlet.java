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

public class LoginServlet extends HttpServlet {
	
	private UserService userService = new UserServiceImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username	= req.getParameter("username");
		String password	= req.getParameter("password");
		
		if (userService.existsUsername(username)) {
			
			User loginUser = userService.login(new User(null, username, password, null));
			
			if (loginUser == null ) {
				// 把错误信息, 和回显的表单项信息, 保存到request域中
				req.setAttribute("msg", "用户名或密码错误!");
				req.setAttribute("username", username);
				// 跳回登录页面
				req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
			} else {
				
				req.getRequestDispatcher("/pages/user/login_success.jsp").forward(req, resp);
			}
			
		} else {
			System.out.println("用户名[" + username +"]不存在!");
			req.getRequestDispatcher("/pages/user/login.jsp").forward(req, resp);
		}
	}

}
