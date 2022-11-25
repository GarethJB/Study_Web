<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>계산결과</h2>
	<% 
	// set ↔ get
	// String → int
	// Object → Integer
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	String op = request.getParameter("op");
	int result = 0;
	if (op.equals("+")) {
		result = num1 + num2;
		request.setAttribute("result", result + "");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	} else if (op.equals("-")) {
		result = num1 - num2;
		request.setAttribute("result", result + "");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	} else if (op.equals("*")) {
		result = num1 * num2;
		request.setAttribute("result", result + "");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	} else if (op.equals("/")) {
		result = num1 / num2;
		request.setAttribute("result", result + "");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	} else {
		out.print("<h2>연산자를 인식할 수 없습니다.</h2>");
		out.print("<div><a href='calculate.jsp'>돌아가기</a></div>");
	}
	
	%>
	
	

	
	

</body>
</html>