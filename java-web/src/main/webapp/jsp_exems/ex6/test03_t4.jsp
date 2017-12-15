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
<h2>jsp:useBean 테스트 III</h2>
type과 class 구분하기

<%
//useBean을 사용하기 전에 먼저 객체를 만들어 pageContext 보관소에 저장해 보자.
pageContext.setAttribute("list", new java.util.ArrayList());
%>

<jsp:useBean id="list" type="java.util.ArrayList" class="java.util.ArrayList"/>

<%--
//먼저 PageContext 보관소에서 객체를 찾는다
java.util.ArrayList list = pageContext.getAttribute("list");

//없으면 생성한다
if (list == null){
    list = new java.util.ArrayList();
    //생성한 객체는 PageContext보관소에 저장한다.
    pageContext.setAttribute("list", list);
}   
 --%>
<p>
리스트 크기<%=list.size() %>
</p>

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