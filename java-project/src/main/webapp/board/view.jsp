<%@page import="java100.app.dao.BoardDao"%>
<%@page import="java100.app.domain.Board"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<% BoardDao boardDao = ContextLoaderListener.iocContainer.getBean(BoardDao.class);
%>
<!DOCTYPE html>
<html>
<head>
<title>게시판관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<jsp:include page="/header.jsp"/>
<h1>게시물 상세 정보</h1>
<%try {
    int no = Integer.parseInt(request.getParameter("no"));
    Board board = boardDao.selectOne(no);
    
    if (board != null) { %>

<form action='update.jsp' method='post'>
<div class='form-group row'>
<label for='no' class='col-sm-2 col-form-label'>번호</label>
<div class='col-sm-10'>
<input class='form-control' readonly id='no' type='number' name='no' value=<%=board.getNo() %>>
</div>
</div>
<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label'>제목</label>
<div class='col-sm-10'>
<input class='form-control' id='title' type='text' name='title' value=<%=board.getTitle() %>>
</div>
</div>
<div class='form-group row'>
<label for='content' class='col-sm-2 col-form-label'>내용</label>
<div class='col-sm-10'>
<input class='form-control' id='content' type='text' name='content' value=<%=board.getContent() %>>
</div>
</div>
<div class='form-group row'>
<label for='date' class='col-sm-2 col-form-label'>등록일</label>
<div class='col-sm-10'>
<input class='form-control' readonly id='date' type='date' name='date' value=<%=board.getRegDate() %>>
</div>
</div>
<div class='form-group row'>
<label for='count' class='col-sm-2 col-form-label'>조회수</label>
<div class='col-sm-10'>
<input class='form-control' readonly id='count' type='number' name='count' value=<%=board.getViewCount() %>>
</div>
</div>
<div class='form-group row'>
<div class='col-sm-10'>
<button class='btn btn-primary btn-sm'>변경</button>
<a href='delete.jsp?no=<%=board.getNo() %>' class='btn btn-danger btn-sm'>삭제</a>
</div>
</div>
</form>
<%} else {
%>
    <p><%=no %> 번의 게시물 정보가 없습니다.</p>
    <%
}

} catch (Exception e) {
e.printStackTrace();
%>  
<%=e.getMessage()%>
<%
} %>

<jsp:include page="/footer.jsp"/>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>


