package com.dragontalker.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.pojo.User;
import com.dragontalker.service.UserService;
import com.dragontalker.service.impl.UserServiceImpl;
import com.dragontalker.utils.WebUltis;

public class UserServlet extends BaseServlet {
	
	private UserService userService = new UserServiceImpl();

	protected void login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

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
		
	}
	
	protected void regist(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		User user = new User();
		WebUltis.copyParamToBean(req, user);
		
		String code	= req.getParameter("code");
		
		if ("abcde".equalsIgnoreCase(code)) {
			
			if (userService.existsUsername(user.getUsername())) {
				req.setAttribute("msg", "用户名已存在!");
				req.setAttribute("username", user.getUsername());
				req.setAttribute("email", user.getEmail());
				req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
			} else {
				userService.registerUser(new User(null, user.getUsername(), user.getPassword(), user.getEmail()));
				req.getRequestDispatcher("/pages/user/regist_success.jsp").forward(req, resp);
			}
			
		} else {
			req.setAttribute("msg", "验证码错误!");
			req.setAttribute("username", user.getUsername());
			req.setAttribute("email", user.getEmail());
			req.getRequestDispatcher("/pages/user/regist.jsp").forward(req, resp);
		}
	}

}
