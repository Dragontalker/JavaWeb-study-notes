<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main</title>
</head>
<body>
	头部信息<br>
	主题内容<br>
	<%-- 
		<%@ include file="" %> 就是静态包含
			file属性指定你要包含jsp页面的路径
	
	--%> 
	<%@ include file="footer.jsp" %>
</body>
</html>