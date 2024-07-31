<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2024-07-31
  Time: 오후 3:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>스크립틀릿 사용 예제</title>
</head>
<body>
<%@ include file="header.jsp" %>
<%
    Boolean condition = (Boolean) request.getAttribute("condition");
    if (condition != null && condition) {
%>
<p>전달 받은 조건은 TRUE!</p>
<%
} else {
%>
<p>전달 받은 조건은 FALSE!</p>
<%
    }
%>

<h2>리스트 컬렉션 출력하기</h2>
<ul>
    <%
        List<String> items = (List<String>) request.getAttribute("list");
        if (items != null) {
            for (String item : items) {
    %>
    <li><%= item %></li>
    <%
            }
        }
    %>
</ul>
</body>
</html>
