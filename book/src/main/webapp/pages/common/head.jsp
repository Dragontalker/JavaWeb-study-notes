<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String basePath = request.getScheme() 
			+ "://"
			+ request.getServerName()
			+ ":"
			+ request.getServerPort()
			+ request.getContextPath()
			+ "/";

	pageContext.setAttribute("basePath", basePath);
%>
<base href="<%=basePath %>">
<link type="text/css" rel="stylesheet" href="static/css/style.css" />
<script type="text/javascript" src="static/script/jquery-1.7.2.js"></script>
		