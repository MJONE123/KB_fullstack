<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 3:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>EL문법의 Scope 확인용 페이지</h1>

<h2>Request 스코프</h2>
<p>${request !=null ? request : "뚱인데요"}</p>


<h2>Session 스코프</h2>
<p>${Session !=null ? Session : "뚱인데요"}</p>

<h2>Application 스코프</h2>
<p>${application !=null ? application : "뚱인데요"}</p>

<h2>Page 스코프</h2>
<p>${page !=null ? page : "뚱인데요"}</p>

</body>
</html>
