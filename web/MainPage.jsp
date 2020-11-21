<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-11-19
  Time: 오후 4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%
    //    String id = (String)session.getAttribute("id");
//    int CardNum = (int)session.getAttribute("CardNum");
//    int UserNum = (int)session.getAttribute("UserNum");
//    String ComName = (String)session.getAttribute("ComName");
//    String UserName = (String)session.getAttribute("UserName");
//    String PhoneNum = (String)session.getAttribute("PhoneNum");
//    String Division = (String)session.getAttribute("Division");
//    String Position = (String)session.getAttribute("Position");
//    String email = (String)session.getAttribute("email");
%>
<html>
<head>
    <title>님의 명함관리 페이지</title>
</head>
<body>
${session} 님 환영합니다.
<form action="NewBusinessCard.jsp">
    <input type="submit" value="명함등록">
</form>

<form action="LogOutServlet">
    <input type="submit" value="명함등록">
</form>
</body>
</html>