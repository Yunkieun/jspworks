<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 한글이 깨지는 경우 사용
	//request.setCharacterEncoding("utf-8");

	// 폼에 입력된 자료 받아오기 
	String id = request.getParameter("userid");
	String name = request.getParameter("uname");
%>

<p>아이디: <%=id %></p>
<p>이름: <%=name %></p>