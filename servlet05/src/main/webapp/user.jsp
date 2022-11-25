<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>아이디 : user1</li>
		<li>이름 : ${name}</li>
		<li>잔액 : <fmt:formatNumber value='${money}' type='currency' />  </li>
	</ul>

</body>
</html>