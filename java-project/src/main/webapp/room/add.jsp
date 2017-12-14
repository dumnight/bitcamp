<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.List"%>
<%@page import="java100.app.domain.Room"%>
<%@page import="java100.app.dao.RoomDao"%>
<%@page import="java100.app.listener.ContextLoaderListener"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    trimDirectiveWhitespaces="true"%>

<% RoomDao roomDao = ContextLoaderListener.iocContainer.getBean(RoomDao.class);
PrintWriter out2 = new PrintWriter(out);%>


<!DOCTYPE html>
<html>
<head>
<title>강의실관리</title>
<link rel='stylesheet' href='../node_modules/bootstrap/dist/css/bootstrap.min.css'>
<link rel='stylesheet' href='../css/common.css'>
</head>
<body>
<div class='container'>
<%
 out.flush();
 RequestDispatcher rd = request.getRequestDispatcher("/header");
        rd.include(request, response); 
        %>
<h1>강의실 등록 결과</h1>
<%
try {
    Room room = new Room();
    room.setLocation(request.getParameter("location"));
    room.setName(request.getParameter("name"));
    room.setCapacity(Integer.parseInt(request.getParameter("capacity")));
    
    roomDao.insert(room);
    
    out.println("<p>저장하였습니다.</p>");
    
} catch (Exception e) {
    e.printStackTrace();
    out.println(e.getMessage()); 
}
%>

<p>저장하였습니다.</p>
<p><a href='list.jsp' class='btn btn-primary btn-sm'>목록</a></p>
<%
out.flush();
rd = request.getRequestDispatcher("/footer");
rd.include(request, response); %>
</div>
<script src='../node_modules/jquery/dist/jquery.slim.min.js'></script>
<script src='../node_modules/popper.js/dist/umd/popper.min.js'></script>
<script src='../node_modules/bootstrap/dist/js/bootstrap.min.js'></script>
</body>
</html>
