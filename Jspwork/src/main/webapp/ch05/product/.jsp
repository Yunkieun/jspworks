<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 선택 결과</title>
<style>
	#container{width: 80%; margin: 30 auto; text-align: center;}
	select{padding: 5px;}
</style>
</head>
<body>
	<div id="container">
		<h2>상품 선택 결과</h2>
		<hr>
		<p>선택한 상품은: ${param.select}</p>
	</div>
</body>
</html>