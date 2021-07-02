<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>forEach.jsp</title>
	</head>
	
	<body>
		<%-- 1. 遍历1到10, 输出 
			begin属性设置开始的索引
			end属性设置结束的索引
			var属性表示循环的变量
			
			for (int i = 0; i < 10; i++)
		--%>
		<table>
			<c:forEach begin="1" end="10" var="i">
				<tr>
					<td>第${ i }行</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>