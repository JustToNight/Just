<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/18
  Time: 16:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="updateUser">
<input type="hidden" name="id" value="${user.uid}" id="uid"><br/>
<input type="text" value="${user.stuname}" name="stuname" id="uname">
<input type="text" value="${user.stuage}" name="stuage" id="upwd">
<input type="submit" id="update" value="修改/新增">
</form>
</body>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script>
</script>
</html>
