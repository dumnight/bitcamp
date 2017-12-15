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
<h2>jsp:include</h2>
RequestDispatcher의 include()와 똑같은 기능을 수행한다<br>


<%--page 속성에 지정한 JSP를 실행한 후 다시돌아온다 --%>
<jsp:include page="test02_p1.jsp"/>

<hr>

<jsp:include page="test02_p2.jsp"/>

</body>
</html>