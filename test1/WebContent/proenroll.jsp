<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>접속 중인 아이디<%session.getAttribute("profId"); %></h1>
	<h3>교수 : 과목 등록</h3>
	<form action="proenroll.do" method="post">
		ID:<input type="text" name="subjectId" /><br>
		TITLE:<input type="text" name="subjectName" /><br>
		# of Student:<input type="text" name="subjectCount" /><br>
		<input type="hidden" name="profId" value="profId" />
		<input type="submit" value="Enroll"/>
	</form>
</body>
</html>