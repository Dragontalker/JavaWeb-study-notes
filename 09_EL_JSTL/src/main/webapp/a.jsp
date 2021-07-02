<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>a.jsp</title>
	</head>
	
	<body>
		<%
			request.setAttribute("key", "value");
		%>
		表达式脚本输出key的值是: <%=request.getAttribute("key1") %>
		
		<br>
		
		EL表达式输出key的值是: ${ key1 }
	</body>
</html>