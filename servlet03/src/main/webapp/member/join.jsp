<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div><a href='../'>홈으로</a></div>
<hr>
<h3>회원가입</h3>
<form method="post" action="info.jsp">
<div>이름 : 
	<input type='text' name='name' > </div>
<div>성별 : 
	<input type='radio' name='gender' value='남' checked >남
	<input type='radio' name='gender' value='여' >여
</div>
<div>
	<input type="checkbox" name='hobby' value='농구' >농구
	<input type="checkbox" name='hobby' value='축구' >축구
	<input type="checkbox" name='hobby' value='테니스' >테니스
</div>
<input type="submit" value='가입'>
</form>
</body>
</html>