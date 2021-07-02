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
					1. scape 属性设置保存到哪个域
						- page表示PageContext域
						- request表示Request域
						- session表示Session域
						- application表示ServletContext域
					2. var属性设置key是多少
					3. value属性设置value是多少
		--%>
		保存之前: ${ requestScope.abc }<br>
		<c:set scope="request" var="abc" value="abcValue"/>
		保存之后: ${ requestScope.abc }<br>
		
		<hr>
		
		<%--
			ii. <c:if />
			 if标签用来做if判断
			 
			 test属性表示判断的条件(使用EL表示式输出)
		--%>
		<c:if test="${ 12 == 12 }">
			<h1>12等于12</h1>
		</c:if>
		
		<hr>
		
		<%--
			iii. <c:choose> <c:when> c:otherwise>标签
			作用: 多路判断, 跟switch...case...default非常接近
			
			choose标签开始选择判断
			when标签表示每一种判断情况
			otherwise标签表示剩下的情况
			
			<c:choose> <c:when> c:otherwise>标签使用时需要注意的点:
				1. 标签里不能使用html注释
		--%>
		<%
			request.setAttribute("height", 158);
		%>
		<c:choose>
			<c:when test="${ requestScope.height > 190 }">
				<h2>小巨人</h2>
			</c:when>
			<c:when test="${ requestScope.height > 180 }">
				<h2>很高</h2>
			</c:when>
			<c:when test="${ requestScope.height > 170 }">
				<h2>还可以</h2>
			</c:when>
			<c:otherwise>
				<h2>剩下的情况</h2>
			</c:otherwise>
		</c:choose>
	</body>
</html>