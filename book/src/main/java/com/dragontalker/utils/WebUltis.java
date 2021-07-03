package com.dragontalker.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class WebUltis {

	public static void copyParamToBean(HttpServletRequest request, Object bean) {
		
		try {
			
			BeanUtils.populate(bean, request.getParameterMap());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
