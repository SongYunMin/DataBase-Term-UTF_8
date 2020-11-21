<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-11-21
  Time: 오후 5:47
  To change this template use File | Settings | File Templates.
  명함정보에 들어갈 것
  명함 번호
  성명
  휴대전화 번호
  부서
  직급
  이메일 주소
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
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
    <form action="NewBusinessCardServlet" method="post">
        <h4 class="text-center">명함 추가 페이지</h4>
        <div class="form-group">
            <input type="text" class="form-control" name="NewBusinessCardCardSignature" placeholder="이름">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="NewBusinessCardCardPhone" placeholder="전화번호">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="NewBusinessCardComName" placeholder="회사이름">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="NewBusinessCardComPhone" placeholder="회사번호">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="NewBusinessCardComDivision" placeholder="회사부서">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="NewBusinessCardComPosition" placeholder="회사직급">
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="NewBusinessCardComAddress" placeholder="회사주소">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">명함등록</button>
        </div>
    </form>
    <p class="text-center"><a href="MainPage.jsp">등록취소</a></p>
</div>
</body>
</html>