<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-11-19
  Time: 오후 4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ID : ${id} <br>
    PW : ${password} <br>

    <%
        int i=3;
        out.println("i = " + i);
        request.setAttribute("ia", 3);
    %>
    <br>
    <p>
        i = <%= i %>
    </p>
    // Extension Language 은 Type 을 적절 하게 변경 함
    i = ${ia < 4}
</body>
</html>
