<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page import="java.util.*"%> 
<%@ page import="com.dragontalker.pojo.Student"%> 
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>upload.jsp</title>
	</head>
	<body>
		<form action="upload" method="post" enctype="multipart/form-data">
			用户名： <input type="text" name="username" /> <br>
			头像: <input type="file" name="photo" /> <br>
			<input type="submit" name="上传" />
		</form>
	</body>
</html>