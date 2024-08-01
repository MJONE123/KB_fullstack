<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-08-01
  Time: 오후 3:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP- Hello World</title>
</head>
<body>
 <%@ include file="header.jsp"%>
<h1>컨트롤러에 의해 배달 된 about.jsp 파일입니다!</h1>
<h2>${msg}</h2>
<img src="${imgsrc}" alt="어서와" />
</body>
</html>
