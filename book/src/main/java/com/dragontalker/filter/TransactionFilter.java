package com.dragontalker.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.dragontalker.utils.JdbcUtils;



public class TransactionFilter implements Filter {

	@Override
	public void doFilter(ServletRequest servletRequest, 
			ServletResponse servletResponse, FilterChain filterChain)
			throws IOException, ServletException {
		
		
		try {
			filterChain.doFilter(servletRequest, servletResponse);
			
			JdbcUtils.commitAndClose();
		} catch (Exception e) {
			JdbcUtils.rollbackAndClose();
			e.printStackTrace();
			
			throw new RuntimeException(e);
		}
	}

}
