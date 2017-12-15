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
<h2>jsp:useBean 테스트</h2>
인스턴스 생성하기

<jsp:useBean id="list" class="java.util.ArrayList"/>

<%--
//먼저 PageContext 보관소에서 객체를 찾는다.
java.util.ArrayList list = pageContext.getAttribute("list");

//없으면 생성한다
if (list == null){
    list = new java.util.ArrayList();
    //생성한 객체는 PageContext보관소에 저장한다.
    pageContext.setAttribute("list", list);
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