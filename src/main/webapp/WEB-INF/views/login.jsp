<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Insert title here</title>
</head>
<body>
<h1><font color="red">${errorMessage}</font></h1>
<form action="/login" method="POST">
	Name: <input type="text" name="name"/>
	Password: <input type="password" name="password" />
	<input type="submit" />
</form>
</body>
</html>