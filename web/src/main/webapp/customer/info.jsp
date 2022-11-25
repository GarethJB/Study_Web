<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>스마트웹&amp;앱</title>
        

    </head>
    <body>
        <div class="d-flex" id="wrapper">
            <!-- Sidebar-->
         	<jsp:include page="/include/sidebar.jsp" /> 
            <!-- Page content wrapper-->
            <div id="page-content-wrapper">
                <!-- Top navigation-->
               	<jsp:include page="/include/navigation.jsp" />
                <!-- Page content-->
                <div class="container-fluid">
                    <h1 class="mt-4">고객정보</h1>
                    <table class='w-px400 mt-5'>
                    	<tr>
                    		<th class='w-px140'>고객명</th>
                    		<td>${dto.name}</td>
                    	</tr>
                    	<tr>
                    		<th class='w-px140'>성별</th>
                    		<td>${dto.gender}</td>
                    	</tr>
                    	<tr>
                    		<th class='w-px140'>이메일</th>
                    		<td>${dto.email}</td>
                    	</tr>
                    	<tr>
                    		<th class='w-px140'>전화번호</th>
                    		<td>${dto.phone}</td>
                    	</tr>
                    </table>
                    
                    <div class='btnSet mt-3'>
                    	<button class='btn btn-primary' onclick='location="modify.cu?id=${dto.id}"'>정보수정</button>
                    	<button class='btn btn-secondary' onclick="go_delete()">회원삭제</button>
                    </div>
                    <script>
                    	function go_delete() {
                    		if(confirm("[${dto.name}]님의 정보를 삭제하시겠습니까?")) {
                    			location='delete.cu?id=${dto.id}';
                    		}
                    	}
                    </script>
                    
                </div>
            </div>
        </div>
    </body>
</html>