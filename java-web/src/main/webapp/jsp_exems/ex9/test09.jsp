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

<h3>c:forTokens 태그</h3>
<p>문자열을 특정 구분자로 분리된 문자열을 전문적으로 처리하는 태그<br>
<%--
<c:forTokens var="변수명" items="문자열" 또는 EL 리턴값" delims="구분자">
    ....
</c:forTokens>

 --%>
</p>

<p>배열: 
<c:forTokens items="홍길동, 유관순, 임꺽정 ,안중근,윤봉길,김구" var="item" delims=",">
    ${item},
</c:forTokens>
</p>

<p>배열: 
<c:forTokens items="홍길동&age=20&working=true" var="item" delims="&">
    ${item},
</c:forTokens>
</p>




<br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>