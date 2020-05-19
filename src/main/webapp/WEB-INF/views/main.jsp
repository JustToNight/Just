<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/18
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>姓名</th>
        <th>年龄</th>
        <th colspan="2">操作</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <th>${user.stuname}</th>
            <th>${user.stuage}</th>
            <th><a href="deleteUser?uid=${user.uid}">删除</a></th>
            <th><a href="toUpdate?uid=${user.uid}">更新</a></th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
