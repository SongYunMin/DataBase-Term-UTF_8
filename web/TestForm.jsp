<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-11-19
  Time: 오후 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>테스트용 로그인 페이지</title>
    <style>
        table {
            margin: auto;
            width: 400px;
            border: 1px solid gray;
            text-align: center;
        }
        .td_title{
            font-weight: bold;
            font-size: x-large;
        }
    </style>
</head>
<body>
<form name="loginForm" action="SesssionLogin" method="post">
    <table>
        <tr>
            <td colspan="2" class="td_title">
                로그인 페이지
            </td>
        </tr>
        <tr>
            <td><label for = "id">아이디 : </label></td>
            <td><input type="text" name="id" id="ID"/></td>
        </tr>
        <tr>
            <td><label for = "passwd">비밀번호 : </label></td>
            <td><input type="password" name="passwd" id="Passwd"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <a href="javascript:lginform.submit()">로그인</a>&nbsp;&nbsp;
                <a href="joinForm.jsp">회원가입</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
