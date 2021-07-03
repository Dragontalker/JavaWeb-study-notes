<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
	
		<meta charset="UTF-8">
		<title>图书管理</title>
		
		<%@ include file="/pages/common/head.jsp" %>
		
	</head>
	
	<body>
		
		<div id="header">
				<img class="logo_img" alt="" src="static/img/logo.gif" >
				<span class="wel_word">图书管理系统</span>
				
				<%@ include file="/pages/common/manager_menu.jsp" %>
		</div>
		
		<div id="main">
			<table>
				<tr>
					<td>名称</td>
					<td>价格</td>
					<td>作者</td>
					<td>销量</td>
					<td>库存</td>
					<td colspan="2">操作</td>
				</tr>
				
				<c:forEach items="${ requestScope.books }" var="book">		
					<tr>
						<td>${ book.name }</td>
						<td>${ book.price }</td>
						<td>${ book.author }</td>
						<td>${ book.sales }</td>
						<td>${ book.stock }</td>
						<td><a href="pages/manager/book_edit.jsp">修改</a></td>
						<td><a href="manager/bookServlet?action=delete&id=${ book.id }">删除</a></td>
					</tr>	
				</c:forEach>	
				
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td><a href="pages/manager/book_edit.jsp">添加图书</a></td>
				</tr>	
			</table>
		</div>
		
		<%@ include file="/pages/common/footer.jsp" %>
		
	</body>
	
</html>