package com.dragontalker.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet extends BaseServlet {

	protected void createOrGetSession(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		boolean isNew = session.isNew();
		
		String id = session.getId();
		
		resp.getWriter().write("得到的Session, 它的id是: " + id + " <br/>");
		resp.getWriter().write("这个Session是否是新创建的: " + isNew + " <br/>");
	}
	
	protected void setAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getSession().setAttribute("key1", "value1");
	}
	
	protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Object key1 = req.getSession().getAttribute("key1");
		resp.getWriter().write("从Session中取出key1的数值是: " + key1);
	}
	
	protected void defaultLife(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int maxInactiveInterval = req.getSession().getMaxInactiveInterval();
		
		resp.getWriter().write("Session的默认超时时常为: " + maxInactiveInterval + "秒");
	}
	
	protected void life3(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		
		session.setMaxInactiveInterval(3);
		
		resp.getWriter().write("当前Session已经设置为3秒超时");
	}

}
