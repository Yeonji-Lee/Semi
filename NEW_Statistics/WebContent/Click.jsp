<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>Document</title>
		<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	<input type="button" id=btn value="통계">
	
	<script>
	$("#btn").on("click",function(){
		location.href="statistics.google";
	});
	</script>

</body>
</html>