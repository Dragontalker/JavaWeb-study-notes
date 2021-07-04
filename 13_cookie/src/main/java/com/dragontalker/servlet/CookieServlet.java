package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dragontalker.utils.CookieUltis;

public class CookieServlet extends BaseServlet {

	private static final long serialVersionUID = 3530097617786374562L;
	
    protected void createCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// 1. 创建Cookie对象
    	Cookie cookie1 = new Cookie("key1", "value1");
    	Cookie cookie2 = new Cookie("key2", "value2");
    	Cookie cookie3 = new Cookie("key3", "value3");
    	// 2. 通知客户端保存Cookie
    	resp.addCookie(cookie1);
    	resp.addCookie(cookie2);
    	resp.addCookie(cookie3);
    	
    	resp.getWriter().write("Cookie创建成功");
    }
    
    protected void getCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Cookie[] cookies = req.getCookies();
    	
    	Cookie myCookie = CookieUltis.findCookie("key1", cookies);
    	
    	if (myCookie != null) {
    		System.out.println("找到了需要的Cookie");
    	}
    }

}
