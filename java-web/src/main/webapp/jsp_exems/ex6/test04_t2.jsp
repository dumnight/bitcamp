<%@page import="domain.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>JSP 예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h2>jsp:setProperty 테스트</h2>
셋터 호출하기

<%
// 객체 생성
Member m = new Member();

// 보관소에 저장한다
pageContext.setAttribute("m", m);
%>


<jsp:setProperty property="name" name="m" value="고길동"/>

<h2>Member 객체 내용</h2>
<%=m.toString()%>

</body>
</html>