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
    <title>명함추가페이지</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>
<form action="NewBusinessCardServlet" method="post">
    이름 : <input type="text" name="NewBusinessCardCardSignature"><br>
    전화번호 : <input type="text" name="NewBusinessCardCardPhone"><br>
    회사이름 : <input type="text" name="NewBusinessCardComName"><br>
    회사번호 : <input type="text" name="NewBusinessCardComPhone"><br>
    회사부서 : <input type="text" name="NewBusinessCardComDivision"><br>
    회사직급 : <input type="text" name="NewBusinessCardComPosition"><br>
    회사주소 : <input type="text" name="NewBusinessCardComAddress"><br>
    <input type="submit" value="등록">
</form>
</body>
</html>
