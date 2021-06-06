<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="prologin.do" method="post">
		ID:<input type="text" name="profId" /><br>
		PASSWORD:<input type="password" name="profPwd" /><br>
		<input type="radio" value="Professor" checked />Professor
		<input type="radio" value="Student" OnClick="window.location.href='stulogin.jsp'" />Student
		<p>
		<input type="submit" value="Login" />
	</form>
</body>
</html>