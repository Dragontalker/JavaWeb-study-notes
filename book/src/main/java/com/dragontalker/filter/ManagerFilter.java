package com.dragontalker.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class ManagerFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, 
			ServletResponse servletResponse, 
			FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub

		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		
		Object user = httpServletRequest.getSession().getAttribute("user");
		
		if (user == null) {
			httpServletRequest.getRequestDispatcher("/pages/user/login.jsp")
				.forward(httpServletRequest, servletResponse);
		}
	}

}
