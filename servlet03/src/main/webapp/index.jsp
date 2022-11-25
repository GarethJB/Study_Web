<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Welcome Page</title>
</head>
<body>
	<div><a href='sum.jsp'>합 계산하기</a></div>
	<h3>홈 [ <%=pageContext.getAttribute("pageInfo") %>
			<%=request.getAttribute("requestInfo") %>
				]</h3>
			
	<%@include file='include/today.jsp' %>

	
	

	<div><a href='calculate.jsp'>계산기</a></div>
	<%
	String rs =null;
	/* if (request.getAttribute("result") != null){
		rs = (String) request.getAttribute("result");
		
	} */
		//String rs = "계산결과 없음";
/* 		if (request.getAttribute("result") != null) {
			rs = (Integer)request.getAttribute("result");		
	}//if */
	
	rs = (String)request.getAttribute("result");
	%>
	<div>계산결과 <%=rs %> </div>

	<div>jsp 에서 선언할 수 있는 것들</div>
	<ul>
		<li>html 태그 선언</li>
		<li>jsp스크립팅 : java코드</li>
		<li>jsp표준액션</li>
		<li>EL</li>
		<li>JSTL</li>
	</ul>
	<%-- <%@include file='include/footer.jsp' %> --%>
	<jsp:include page="include/footer.jsp">
		<jsp:param name='email' value='test@naver.com'/>
		<jsp:param name='phone' value='010.4564.4563'/>
	</jsp:include>
</body>
</html>