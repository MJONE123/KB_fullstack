<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오후 2:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="header.jsp"%>

    <h1>로그인</h1>
    <form method="post" action = "login">
        <label for = "username">아이디 : </label>
        <input type = 'text' id = "username" name="username" required />
        <br />
        <label for = "password">비밀번호 : </label>
        <input type = 'text' id = "password" name="password" required />
        <br />
        <button type="submit">로그인</button>
    </form>
</body>
</html>
