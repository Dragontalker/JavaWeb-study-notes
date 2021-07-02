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
	</body>
</html>