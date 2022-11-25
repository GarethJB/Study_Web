<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
	<h2>계산기</h2>
	<form method="post" action="calculate_result.jsp">
		<input type='text' name='num1' id='onlyNum' >
		<input type='text' name='op' >
		<input type='text' name='num2' >
		<input type='submit' value='계산하기'>
	
	</form>
	
	<script>
		$("#onlyNum").keyup(function(event){
			var inputVal = $(this).val();
			$(this).val(inputVal.replace(/[^0-9]/gi,''));
		});
	</script>
</body>
</html>