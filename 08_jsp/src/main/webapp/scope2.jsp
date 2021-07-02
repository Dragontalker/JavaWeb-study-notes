<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope2.jsp 页面</h1>
	<hr>
	<br>
	<br>
	
	pageContext域是否有值: <%=pageContext.getAttribute("key") %><br>
	request域是否有值: <%=request.getAttribute("key") %><br>
	session域是否有值: <%=session.getAttribute("key") %><br>
	application域是否有值: <%=application.getAttribute("key") %><br>
</body>
</html>