<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>pageContext.jsp</title>
	</head>
	
	<body>
		<%-- 
			request.getScheme() 它可以获取请求的协议
			request.getServerName() 获取请求的服务器ip或域名
			request.getServerPort() 获取请求的服务器端口号
			request.getContextPath() 获取当前工程路径
			request.getMethod() 获取请求的方式(GET/POST)
		--%>
		1. 协议: ${ pageContext.request.scheme }<br>
		2. 服务器ip: ${ pageContext.request.serverName }<br>
		3. 服务器端口: ${ pageContext.request.serverPort }<br>
		4. 获取工程路径: ${ pageContext.request.contextPath }<br>
		5. 获取请求方法: ${ pageContext.request.method }<br>
		6. 协议: ${ pageContext.request.scheme }<br>
		7. 协议: ${ pageContext.request.scheme }<br>
	</body>
</html>