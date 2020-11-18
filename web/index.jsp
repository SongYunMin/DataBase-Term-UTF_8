
<%--
  Created by IntelliJ IDEA.
  User: SongYunMin
  Date: 2020-11-17
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<jsp:useBean id="beanclass" class="BeanClass" scope="page"/>
<jsp:setProperty name="beanclass" property="test" value="Test Value"/>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
$END$
<%
    String content = (String)request.getAttribute("content");
%>
<h2>${content}</h2>
<%--<%beanclass.setContent(content);%>--%>


</body>
</html>
