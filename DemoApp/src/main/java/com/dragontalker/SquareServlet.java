package com.dragontalker;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.eclipse.jdt.internal.compiler.lookup.ImplicitNullAnnotationVerifier;

public class SquareServlet extends HttpServlet {

	private static final long serialVersionUID = -8187724828753586728L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		HttpSession session = req.getSession();
		
		int k = (int) session.getAttribute("k");
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		
		out.println(">> Result is " + k);
		
	}
	
		
		
}
