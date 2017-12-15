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
<h1>표현식(Expression element) 테스트</h1>
<%int age = 18;%> <!-- 스크립틀릿은 그대로 복사한다 -->

나이 <%=age%>는 <%=(age < 19) ? "미성년자" : "성년" %> 입니다.

<%--
int age = 18;
out.println("\n");
out.write("나이 ");
out.print(age);
out.write("는 ");
out.print(age < 19) ? "미성년자" : "성년 );
out.wirte(" 입니다.\n");

 --%>

</body>
</html>