<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>b.jsp</title>
	</head>
	
	<body>
		<%
			pageContext.setAttribute("key", "pageContextValue");
			request.setAttribute("key", "requestValue");
			application.setAttribute("key", "applicationValue");
			session.setAttribute("key", "sessionValue");
			
		%>
		
		<br>
		
		EL表达式输出key的值是: ${ key }
	</body>
</html>