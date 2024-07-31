<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>scope 데이터 보기</title>
</head>
<body>
pageScope의 속성 값은 : ${pageScope.scopeName}</br>
requestScope의 속성 값은 : ${requestScope.scopeName}</br>
sessionScope의 속성 값은 : ${sessionScope.scopeName}</br>
applicationScope의 속성 값은 : ${applicationScope.scopeName}</br>

scopeName 자동찾기 : ${scopeName} </br>

member : ${member.name}(${member.userid})
</body>
</html>
