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
    		resp.getWriter().write("找到了需要的Cookie");
    	}
    }
    
    protected void updateCookie(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Cookie cookie = new Cookie("key1", "newValue1");
 
    	resp.addCookie(cookie);
    	
    	resp.getWriter().write("Cookie已经修改好了");
    }
    
    protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Cookie cookie = new Cookie("defaultLife", "defaultLife");
    	
    	cookie.setMaxAge(-1);
 
    	resp.addCookie(cookie);
    	
    	resp.getWriter().write("默认生命周期");
    }
    
    protected void deleteNow(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Cookie[] cookies = req.getCookies();
    	
    	Cookie cookie = CookieUltis.findCookie("defaultLife", cookies);
    	
    	if (cookie != null) {
    		cookie.setMaxAge(0);
        	
        	resp.addCookie(cookie);
    	}
    	
    	resp.getWriter().write("Cookie立刻删除");
    }
    
    protected void life3600(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Cookie cookie = new Cookie("life3600", "life3600");
    	
    	cookie.setMaxAge(60 * 60);
    	
        resp.addCookie(cookie);
    	
    	resp.getWriter().write("Cookie存活一小时");
    }
    
    protected void testPath(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	Cookie cookie = new Cookie("path1", "path1");
    	
    	cookie.setPath(req.getContextPath() +"/abc");
    	
        resp.addCookie(cookie);
    	
    	resp.getWriter().write("Cookie的路径为/13_cookie/abc");
    }

}
