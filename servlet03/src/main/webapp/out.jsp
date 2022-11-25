<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>출력하기</h2>
	<div>1 ~ 10까지 출력</div>
	<hr>
	<%
		for(int no = 1; no <= 10; no++) {
	%>	
		<%= no %>	
	<%
		}
	%>
	
	<hr>
	<%
		for(int no = 1; no <= 10; no++) {
			out.print("<div>" + no + "</div>");
		}
		
	%>
	
	
</body>
</html>