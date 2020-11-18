<%--
  Created by IntelliJ IDEA.
  User: SongYunMin
  Date: 2020-11-17
  Time: 오후 2:53
  To change this template use File | Settings | File Templates.
--%>
<%--<jsp:setProperty name="beanclass" property="test" value="Test Value"/>--%>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
$END$
<%
    String c = (String)request.getAttribute("content");
%>
<h2>${c}</h2>



</body>
</html>
