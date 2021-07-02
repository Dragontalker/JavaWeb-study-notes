<%@ page language="java" 
		 contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
		 
<!DOCTYPE html>

<html>
	<head>
		<meta charset="UTF-8">
		<title>d.jsp</title>
	</head>
	
	<body>
		${ 12 == 12 } 或 ${ 12 eq 12 }<br>
		${ 12 < 12 } 或 ${ 12 lt 12 }<br>
		${ 12 > 12 } 或 ${ 12 gt 12 }<br>
		${ 12 <= 12 } 或 ${ 12 le 12 }<br>
		${ 12 >= 12 } 或 ${ 12 ge 12 }<br>
		<hr>
		${ 12 == 12 && 12 > 11 } 或 ${ 12 eq 12 and 12 gt 11 }<br>
		${ 12 == 12 || 12 > 11 } 或 ${ 12 eq 12 or 12 gt 11 }<br>
		${ !true } 或 ${ not true }<br>
		<hr>
		${ 12 + 12 }<br>
		${ 12 / 12 } 或 ${ 12 div 12 }<br>
		${ 18 mod 12 } 或 ${ 18 % 12 }<br>
	</body>
</html>