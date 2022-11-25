<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>전체 상품목록 조회</h3>
	<table border='1'>
	<tr><th>상품번호</th><th>상품명</th><th>제조사</th><th>가격</th><th>재고량</th> </tr>
		<c:forEach items='${list}' var='list'>
			<tr>
			<td><a href='info.pu?num=${list.num}'>${list.num}</a></td>
			<td>${list.name}</td>
			<td>${list.company}</td>
			<td>${list.price}</td>
			<td>${list.qty}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>