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

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forTokens var="name" items="홍길동,임꺽저으,유관순,안중근,윤봉길" delims=",">
    <p>${name}</p>
</c:forTokens>


</body>
</html>