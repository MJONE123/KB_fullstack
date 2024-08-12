<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-05
  Time: 오후 5:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TODO 추가</title>
</head>
<body>
<%@ include file="../header.jsp"%>
<h1>TODO 추가</h1>
<form method="get" action="/todo/V2/form/save">
    <label for="todo">할 일 :</label>
    <input type="text" id="todo" name="todo" required>
    <br>
    <button type="submit">할일 추가</button>
</form>
</body>
</html>
