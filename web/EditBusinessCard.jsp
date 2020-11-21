<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2020-11-21
  Time: 오후 5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>명함수정페이지</title>
</head>
<body>
<form action="EditBusinessCardServlet" method="post">
    기존 명함 정보 : <br>
    이름 : ${NewBusinessCardCardSignature} <br>
    전화번호 : ${NewBusinessCardCardPhone} <br>
    회사이름 : ${NewBusinessCardComName} <br>
    회사번호 : ${NewBusinessCardComPhone} <br>
    회사부서 : ${NewBusinessCardComDivision} <br>
    회사직급 : ${NewBusinessCardComPosition} <br>
    회사주소 : ${NewBusinessCardComAddress} <br>
    <hr>
    변경할 명함 정보 : <br>
    이름 : <input type="text" name="EditBusinessCardCardSignature"><br>
    전화번호 : <input type="text" name="EditBusinessCardCardPhone"><br>
    회사이름 : <input type="text" name="EditBusinessCardComName"><br>
    회사번호 : <input type="text" name="EditBusinessCardComPhone"><br>
    회사부서 : <input type="text" name="EditBusinessCardComDivision"><br>
    회사직급 : <input type="text" name="EditBusinessCardComPosition"><br>
    회사주소 : <input type="text" name="EditBusinessCardComAddress"><br>
    <input type="submit" value="변경">
</form>
<form action="MainPage.jsp">
    <input type="submit" value="변경취소">
</form>
</body>
</html>
