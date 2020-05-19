<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/18
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="text" id="name"> &nbsp;&nbsp;&nbsp;
<input type="button" id="getAll" value="显示所有">&nbsp;&nbsp;&nbsp;
<input type="button" id="getByName" value="查询用户">&nbsp;&nbsp;&nbsp;
<input type="button" value="新增" id="add">
</body>
<script src="http://libs.baidu.com/jquery/2.0.0/jquery.min.js"></script>
<script>
    $(function () {
        $("#getAll").click(function () {
            location.href="getAll";
        })
        $("#getByName").click(function () {
            location.href="getUserByName?name="+$("#name").val();
        })
      $("#add").click(function () {
        location.href="toUpdate";
      })

    })
</script>
</html>
