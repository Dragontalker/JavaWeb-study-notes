<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<title>core.jsp</title>
	</head>
	
	<body>
		<%--
			i.<c:set />
				作用: 往域中添加数据
		
				域对象.setAttribute(key, value);
					1. 保存到哪个域
					2. key是多少
					3. value是多少
		--%>
		保存之前: ${ requestScope.abc }<br>
		<c:set />
		保存之后: ${ requestScope.abc }<br>
	</body>
</html>