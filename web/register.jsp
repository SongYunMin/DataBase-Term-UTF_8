<%--
  Created by IntelliJ IDEA.
  User: SongYunMin
  Date: 2020-11-17
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%--<jsp:setProperty name="beanclass" property="test" value="Test Value"/>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
<form action="RegisterSession" method="post">
    아이디 : <input type="text" name="RegisterID"/><br>
    비밀번호 : <input type="password" name="RegisterPassWD"/><br>
    비밀번호 확인 : <input type="password" name="ReRegisterPassWD"><br>
    <hr>
    <input type="submit" value="회원가입"/>
</form>
</body>
</html>
