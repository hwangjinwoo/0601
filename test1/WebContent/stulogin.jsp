<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="stulogin.do" method="post">
		ID:<input type="text" name="id" /><br>
		PASSWORD:<input type="password" name="pwd" /><br>
		<input type="radio" value="Professor" OnClick="window.location.href='prologin.jsp'" />Professor
		<input type="radio" value="Student" checked />Student <br>
		<p>
		<input type="submit" value="Login" />
	</form>
</body>
</html>