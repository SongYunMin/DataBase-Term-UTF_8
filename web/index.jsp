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
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Bootstrap Simple Login Form</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>
            .login-form {
                width: 340px;
                margin: 50px auto;
                font-size: 15px;
            }
            .login-form form {
                margin-bottom: 15px;
                background: #f7f7f7;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                padding: 30px;
            }
            .login-form h2 {
                margin: 0 0 15px;
            }
            .form-control, .btn {
                min-height: 38px;
                border-radius: 2px;
            }
            .btn {
                font-size: 15px;
                font-weight: bold;
            }
        </style>
    </head>
<body>
<div class="login-form">
    <form action="IndexServlet" method="post">
        <h4 class="text-center">UTF-8 명함관리 시스템</h4>
        <div class="form-group">
            <input type="text" class="form-control" name="IndexID" placeholder="아이디">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="IndexPW" placeholder="비밀번호">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">로그인</button>
        </div>
    </form>
    <p class="text-center"><a href="NewAccount.jsp">회원가입</a></p>
</div>
</body>

</html>