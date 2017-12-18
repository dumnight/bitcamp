<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>


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
<h1>새 게시물 등록</h1>
<form action='add' method='post'>
<div class='form-group row'>
<label for='title' class='col-sm-2 col-form-label'>제목</label>
<div class='col-sm-10'>
<input class='form-control' id='title' type='text' name='title'>
</div>
</div>
<div class='form-group row'>
<label for='content' class='col-sm-2 col-form-label'>내용</label>
<div class='col-sm-10'>
<input class='form-control' id='content' type='text' name='content'>
</div>
</div>

<button class='btn btn-primary btn-sm'>추가</button>
</form>
<jsp:include page="/footer.jsp"/>
</div>
<%@ include file="../jslib.txt" %>
</body>
</html>


