package com.dragontalker.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class AdminFilter implements Filter {
	
	public AdminFilter() {
		System.out.println("1. Constructor of AdminFilter called...");
	}
	
	

	@Override
	public void destroy() {
		System.out.println("4. destroy() method of AdminFilter called...");
	}



	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("2. init() method of AdminFilter called...");
		System.out.println("filter-name=" + filterConfig.getFilterName());
		System.out.println("init-param_username=" + filterConfig.getInitParameter("username"));
		System.out.println(filterConfig.getServletContext());
	}



	@Override
	public void doFilter(ServletRequest servletRequest, 
			ServletResponse servletResponse, 
			FilterChain filterChain) 
					throws IOException, ServletException {
		
		System.out.println("3. doFilter() method of AdminFilter called...");
		
		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		
		HttpSession session = httpServletRequest.getSession();
		
		Object user = session.getAttribute("user");
		
		System.out.println(user);
		
		if (user == null) {
			servletRequest.getRequestDispatcher("/login.jsp").forward(servletRequest, servletResponse);
			return;
		} else {
			filterChain.doFilter(servletRequest, servletResponse);
		}
				
	}

}
