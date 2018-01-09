<%@page import="java100.app.domain.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html>
<html>
<head>
<title>도서 관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="../header.jsp"/>
<h1>도서 목록</h1>

<div class="toolbar">
<a href='form' class='btn btn-primary btn-sm'>추가</a>
<form action="list" method="get" class="searchbox">
<input type="text" name="title">
<button>검색</button>
</form>
</div>

<table class='table table-hover'>
<thead>
<tr>
<th>번호</th><th>도서명</th><th>출판사</th><th>가격</th><th>사진</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="book">
<c:set var="title" value="${fn:length(book.title) == 0 ? '(제목이 없습니다)' : book.title}"/>
   <tr>
        <td>${book.no}</td>
        <td><a href='${book.no}'><span class="d-inline-block text-truncate" 
            style="max-width: 260px;">${title}</span></a></td>
        <td>${book.publisher}</td>
        <td>${book.price}</td>
        <c:forEach items="${book.files}" var="file">
        <td><img src="${contextPath}/download/${file.filename}" width="110" height="80"><br></td>
        </c:forEach>
        </tr>
</c:forEach>


</tbody>
</table>


<jsp:include page="../page.jsp"/>

<jsp:include page="../footer.jsp"/>
</div>
<jsp:include page="../jslib.jsp"/>
</body>
</html>