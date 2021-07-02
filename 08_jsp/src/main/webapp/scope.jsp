<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>scope.jsp 页面</h1>
	<hr>
	<br>
	<br>
	<%
		// 往四个域中都分别保存了数据
		pageContext.setAttribute("key", "pageContext");
		request.setAttribute("key", "request");
		session.setAttribute("key", "request");
		application.setAttribute("key", "application");
	%>
	
	pageContext域是否有值: <%=pageContext.getAttribute("key") %><br>
	request域是否有值: <%=request.getAttribute("key") %><br>
	session域是否有值: <%=session.getAttribute("key") %><br>
	application域是否有值: <%=application.getAttribute("key") %><br>
	
	<%
		request.getRequestDispatcher("/scope2.jsp").forward(request, response);
	%>
</body>
</html>