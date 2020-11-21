<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-11-20
  Time: 오후 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원관리 시스템 회원 가입 페이지</title>
    <style>
        table{
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
<form name="joinform" action="registerSession" method="post">
    <table border=1>
        <tr>
            <td colspan="2" class="td_title">
                회원가입 페이지
            </td>
        </tr>
        <tr>
            <td><label for = "id">아이디 : </label></td>
            <td><input type="text" name="id" id="RegisterID"/></td>
        </tr>
        <tr>
            <td><label for = "pass">비밀번호 : </label></td>
            <td><input type="password" name="pass" id="RegisterPasswd"/></td>
        </tr>
        <tr>
            <td><label for = "pass">비밀번호 확인 : </label></td>
            <td><input type="password" name="pass" id="ReRegisterPasswd"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <a href="ResgisterSession">회원 가입</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
