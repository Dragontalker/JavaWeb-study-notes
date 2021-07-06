package com.dragontalker.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AdminFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, 
			ServletResponse servletResponse, 
			FilterChain filterChain) 
					throws IOException, ServletException {
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		
		HttpSession session = httpServletRequest.getSession();
		
		Object user = session.getAttribute("user");
		
		if (user == null) {
			servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest, servletResponse);
			return;
		} else {
			filterChain.doFilter(httpServletRequest, servletResponse);
		}
				
	}

}
