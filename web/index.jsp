<%--
  Created by IntelliJ IDEA.
  User: SongYunMin
  Date: 2020-11-17
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%--<jsp:setProperty name="beanclass" property="test" value="Test Value"/>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>$Title$</title>

</head>
<body>

<form action="Main" method="post">
    <%--     아이디 : <input type="text" name="ID"/>--%>
    <%--     비밀번호 : <input type="password" name="Passwd"/><br>--%>
    <%--    <input type="submit" value="로그인"/>--%>
    <%--    TODO : Yunmin - 아래처럼 하는게 좋을거 같은데?--%>
    <table width="300" border="1">
        <tr height="40">
            <td width="120">아이디</td>
            <td width="180"><input type="text" name="id"></td>
        </tr>
        <tr height="40">
            <td width="120">패스워드</td>
            <td width="180"><input type="password" name="password"></td>
        </tr>
        <input type="submit" value="로그인">

    </table>
</form>

<hr>
<form action="register.jsp">
    <input type="submit" value="회원가입"/>
</form>
</body>
</html>