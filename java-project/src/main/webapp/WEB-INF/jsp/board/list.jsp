<%@page import="java100.app.domain.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>


<!DOCTYPE html>
<html>
<head>
<title>게시판관리</title>
<link rel='stylesheet' href='../../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="../header.jsp"/>
<h1>게시판 목록</h1>

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
<th>번호</th><th>제목</th><th>등록일</th><th>조회수</th><th>작성자</th>
</tr>
</thead>
<tbody>
<c:forEach items="${list}" var="board" >
    <c:set var="title" value="${fn:length(board.title) == 0 ? '(제목이 없습니다)' : board.title}"/>
        <tr>
            <td>${board.no}</td>
            <!-- 
            <td><a href='${board.no}'>${fn:substring(board.title, 0, 20)}
            ${(fn:length(board.title) > 20) ? '...' : ''}</a></td>
             -->
            <td><a href='${board.no}'><span class="d-inline-block text-truncate" 
            style="max-width: 260px;">${title}</span></a></td>
            <td>${board.regDate}</td>
            <td>${board.viewCount}</td>
            <td>${board.writer.name}</td>
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