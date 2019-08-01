<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2019/8/1
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询页面</title>
</head>
<body>
    <form action="selectServlet" method="post">
        请输入id编号：
        <input type="text" name="employeeId"><br>
        <input type="submit" value="查询"><br>
        <input type="reset" value="Reset">
    </form>
</body>
</html>
