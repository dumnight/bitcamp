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
<h2>jsp:useBean 테스트 IV</h2>
scope 지정하기<br>
보관소를 지정하지 않으면 기본이 PageContext이다.

<%
//useBean을 사용하기 전에 먼저 객체를 만들어 pageContext 보관소에 저장해 보자.
pageContext.setAttribute("list", new java.util.ArrayList());
%>

<jsp:useBean id="list1" class="java.util.ArrayList"/>
<jsp:useBean id="list2" class="java.util.ArrayList" scope="request"/>

<%-- list1
java.util.ArrayList list = pageContext.getAttribute("list");
if (list == null){
    list = new java.util.ArrayList();
    //생성한 객체는 PageContext보관소에 저장한다.
    pageContext.setAttribute("list", list);
}   
 --%>
 
 <%-- list2
java.util.ArrayList list = request.getAttribute("list");
if (list == null){
    list = new java.util.ArrayList();
    //생성한 객체는 PageContext보관소에 저장한다.
    request.setAttribute("list", list);
}   
 --%>
<h2>pageContext 보관소</h2>
list1 <%=pageContext.getAttribute("list1") %><br>
list2 <%=pageContext.getAttribute("list2") %><br>

<h2>ServletRequest 보관소</h2>
list1 <%=request.getAttribute("list1") %><br>
list2 <%=request.getAttribute("list2") %><br> 

</body>
</html>