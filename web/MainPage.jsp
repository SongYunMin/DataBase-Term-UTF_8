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
<table>
    <thead>
    <tr>
        <th>이름</th><th>연락처</th><th>회사</th><td>부서</td>
    </tr>
    </thead>
    <tbody>
    <%
        for(int i=0;i<10;i++)
        {
    %>
    <tr>
        <form action="RegisterSession" method="post">
            <td>박강민</td><td>010-9700-0725</td><td>회사명</td><td>부서명</td>
            <td><input type="submit" value="수정"/></td>
            <td><input type="submit" value="삭제"/></td>
        </form>
    </tr>
    <%
        }
    %>>
    </tbody>
</table>
</body>
</html>