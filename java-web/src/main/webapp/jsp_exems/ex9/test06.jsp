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

<h3>if 태그</h3>
<p>조건에 따라 실행 여부를 결정하는 태그이다<br>
&lt;c:if test="EL로 작성된 조건" var="조건 결과를 저장할 변수" scope="page|request|session|application"/><br>
</p>

<c:set var="name" value="홍길동2" scope="page"/>

<c:if test="${name == '홍길동'}" var="result">
홍길동이구나<br>
</c:if>

result: ${result}

</body>
</html>