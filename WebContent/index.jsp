<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.0.min.js"></script>
</head>
<body>
<button>category</button>

<script>
 $("button").on("click",function(){
	 location.href="info.category?category=main&select=info_avgstar desc";
 })
</script>
</body>
</html>