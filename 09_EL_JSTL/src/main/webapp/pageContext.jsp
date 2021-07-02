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
			1. request.getScheme() 它可以获取请求的协议
			2. request.getServerName() 获取请求的服务器ip或域名
			3. request.getServerPort() 获取请求的服务器端口号
			4. request.getContextPath() 获取当前工程路径
			5. request.getMethod() 获取请求的方式(GET/POST)
			6. request.getRemoteHost() 获取客户端的ip地址
			7. session.getId() 获取会话的id
		--%>
		1. 协议: ${ pageContext.request.scheme }<br>
		2. 服务器ip: ${ pageContext.request.serverName }<br>
		3. 服务器端口: ${ pageContext.request.serverPort }<br>
		4. 获取工程路径: ${ pageContext.request.contextPath }<br>
		5. 获取请求方法: ${ pageContext.request.method }<br>
		6. 获取客户端的ip地址: ${ pageContext.request.remoteHost }<br>
		7. 获取会话的id编号: ${ pageContext.request.session.id }<br>
	</body>
</html>