<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-29
  Time: 오후 2:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage = "true"%>
<html>
<head>
    <title>에러 페이지 비상비상</title>
</head>
<body>
    <h1>
        에러 발생 비상비상비상
    </h1>
    <p>요청을 처리하는 도중 에러가 발생하였음</p>
<p>에러메세지 <%= exception.getMessage()%></p>
</body>
</html>
