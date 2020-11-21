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
<form action="NewAccountServlet" method="post">
    <table border=1>
        <tr>
            <td colspan="2" class="td_title">
                회원가입 페이지
            </td>
        </tr>
        <tr>
            <td>이름 : </td>
            <td><input type="text" name="NewAccountName"/></td>
        </tr>
        <tr>
            <td>아이디 : </td>
            <td><input type="text" name="NewAccountID"/></td>
        </tr>
        <tr>
            <td>비밀번호 : </td>
            <td><input type="password" name="NewAccountPW"/></td>
        </tr>
        <tr>
            <td>비밀번호 확인 : </td>
            <td><input type="password" name="NewAccountPW_"/></td>
        </tr>
            <input type="submit" value="회원가입"/>
    </table>
</form>
</body>
</html>