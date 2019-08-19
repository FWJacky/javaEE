<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2019/8/15
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" align="center">
        <tr>
            <td>ItemsId</td>
            <td>ItemsName</td>
            <td>ItemsPrice</td>
        </tr>
        <c:forEach items="${itemsListKey}" var="item">
            <tr>
                <td>${item.itemsId}</td>
                <td>${item.itemsName}</td>
                <td>${item.itemsPrice}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
