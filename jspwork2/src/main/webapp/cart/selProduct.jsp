<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 선택</title>
<link rel="stylesheet" href="../resources/css/style.css">
</head>
<%
	request.setCharacterEncoding("utf-8");

	String username = request.getParameter("username");
	session.setAttribute("userName", username);  // "userName" 이름으로 세션 발급
%>
<body>
	<div id="container">
		<h2>상품선택</h2>
		<hr>
		<p><%=session.getAttribute("userName") %>님 환영합니다.</p>
		<form action="addProduct.jsp" method="post">
			<select name="product">
				<option value="망고">망고</option>
				<option value="딸기">딸기</option>
				<option value="복숭아">복숭아</option>
				<option value="수박">수박</option>
			</select>
			<button type="submit">추가</button>
		</form>
		<p>
		<!-- checkOut.jsp - 장바구니(cart) 페이지임 -->
			<button type="submit"
				onclick="location.href='checkOut.jsp'">계산하기</button>
		</p>
	</div>
</body>
</html>