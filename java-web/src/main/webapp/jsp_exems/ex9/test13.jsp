<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>JSP 예제</title>
<link rel='stylesheet' href='../common.css'>
</head>
<body>
<h1>jstl(jsp standard tag library) 사용법</h1>

<h2>Core 라이브러리</h2>

<h3>c:redirect 태그 II</h3>
<p>특정 페이지로 다시 요청할 것을 클라이언트에게 응답하는 태그이다.<br>
<%--

오류가 발생했을때 오류 내용을 출력하기 위해 error.jsp로 리다이렉트 하는것 보다
포워드 하는 것이 더 바람직 하다. test13을 실행하다 오류가 발생했기 떄문에
그 URL에 대해 오류 내용이 출력되야 한다.
<c:forward page="요청 URL"/>
--%>
</p>

<c:if test="${empty param.name}">
    <jsp:forward page="error.jsp"/>
</c:if>

${param.name} 님 환영합니다.

<br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>