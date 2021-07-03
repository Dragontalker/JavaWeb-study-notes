package com.dragontalker.utils;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class WebUltis {

	public static Object copyParamToBean(Map map, Object bean) {
		
		try {
			
			BeanUtils.populate(bean, map);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
}
