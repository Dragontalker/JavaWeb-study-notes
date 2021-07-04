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
		
	
	}
	
	protected void getAttribute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
	}

}
