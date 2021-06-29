package com.dragontalker;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	private static final long serialVersionUID = -6200733901926457094L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		HttpSession session = req.getSession();
		session.setAttribute("k", k);
		
//		req.setAttribute("k", k);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("square");
//		rd.forward(req, res);
		
		res.sendRedirect("square");
	}

}
