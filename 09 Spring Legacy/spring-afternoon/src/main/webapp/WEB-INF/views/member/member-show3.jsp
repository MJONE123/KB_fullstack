<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-05
  Time: 오후 4:53
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../header.jsp"%>
<html>
<head>
    <title>회원 목록V3</title>
</head>
<body>
<h1>회원 목록V3</h1>
<ul>
    <li><b>ID-NAME</b></li>
<c:forEach var = "member" items="${memberList}">
    <li>${member.id} = ${member.name}</li>
</c:forEach>
</ul>
</body>
</html>
