<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>YongIn LMS</h3>
	<form>
		ID:<input><br>
		PASSWORD:<input><br>
		<input type="radio" value="Professor" OnClick="window.location.href='prologin.jsp'" />Professor
		<input type="radio" value="Student" OnClick="window.location.href='stulogin.jsp'" />Student
		<P>
		<input type="submit" value="Login" />
	</form>
</body>
</html>