<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-05
  Time: 오후 5:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Member List</title>
</head>
<body>
<%@ include file="header.jsp"%>
<h1>항 일 목록1</h1>
<ul>
    <li><b>할 일 리스트</b></li>
    <c:forEach var="todo" items="${todoList}">
        <li>${todo.todo}</li>
    </c:forEach>
</ul>
</body>
</html>
