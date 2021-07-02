<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>other_el_obj.jsp</title>
	</head>
	
	<body>
		输出请求参数username的值: ${ param.username }<br>
		输出请求参数password的值: ${ param.password }<br>
		<hr>
		输出请求参数username的值:${ paramValues.username[0] }<br>
		<hr>
		输出请求header信息:${ header }<br>
		<hr>
		输出请求header中的user-agent信息:${ header['User-Agent'] }<br>
		输出请求header中的Connection信息:${ header.Connection }<br>
		<hr>
		获取Cookie的名称: ${ cookie.JSESSIONID.name }<br>
		获取Cookie的值: ${ cookie.JSESSIONID.value }<br>
		<hr>
		输出 &lt; Context-param &gt; 中username的值${ initParam.username }<br>
		输出 &lt; Context-param &gt; 中url的值${ initParam.url }<br>
	</body>
</html>