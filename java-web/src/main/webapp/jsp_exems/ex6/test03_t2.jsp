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
<h2>jsp:useBean 테스트 II</h2>
인스턴스 찾기

<jsp:useBean id="list" type="java.util.ArrayList"/>

<%--
//먼저 PageContext 보관소에서 객체를 찾는다
java.util.ArrayList list = pageContext.getAttribute("list");

//없으면 예외를 발생시킨다
if (list == null){
    throw new Exception("객체가 없어...");
}   
 --%>

<%
list.add("가가가");
list.add("나나나");
list.add("다다다");
%>
<p>
리스트 개수: <%=list.size() %> <br>
</p>
<%
java.util.ArrayList list2 = (java.util.ArrayList)pageContext.getAttribute("list");
%>

<p>
list2.get(1): <%=list2.get(1) %> <br>
</p>


</body>
</html>