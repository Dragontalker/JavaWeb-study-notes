package com.dragontalker.utils;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

import com.alibaba.druid.util.ListDG.Edge;

public class WebUltis {

	public static <T> T copyParamToBean(Map map, T bean) {
		
		try {
			
			BeanUtils.populate(bean, map);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bean;
	}
	
	public static int parseInt(String strInt, int defaultValue) {
		
		try {
			
			if (strInt != null) {
				return Integer.parseInt(strInt);
			} else {
				return defaultValue;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return defaultValue;
	}
}
