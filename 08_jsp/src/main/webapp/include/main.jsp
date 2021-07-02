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
			- file属性指定你要包含jsp页面的路径
			- 地址中的第一个斜杆 / 表示为http:ip:port/工程路径/ 映射到代码的web目录
			
			
		静态包含的特点:
			1. 静态包含不会翻译被包含的jsp页面
			2. 静态包含其实是把被包含的jsp页面的代码拷贝到包含的位置执行输出
			
		<%@ include file="footer.jsp" %>
	--%> 
	
	<%--  
		<jsp:include page="/include/footer.jsp" /> 这是动态包含
			- page属性是指定你要包含的jsp页面的路径
			- 动态包含也可以像静态包含一样, 把被包含的内容指定输出到包含位置
	
	--%>
	
	<jsp:include page="/include/footer.jsp" />
	
	
</body>
</html>