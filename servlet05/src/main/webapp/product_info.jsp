<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>상품 정보</h3>
	<table border='1'>
	<tr><th>상품번호</th><th>상품명</th><th>제조사</th><th>가격</th><th>재고량</th> </tr>
			<tr>
			<td>${dto.num}</td>
			<td>${dto.name}</td>
			<td>${dto.company}</td>
			<td>${dto.price}</td>
			<td>${dto.qty}</td>
			</tr>
	</table>
</body>
</html>