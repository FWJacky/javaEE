<jsp:useBean id="department" scope="request" type="com.liu.vo.Department"/>
<jsp:useBean id="employee" scope="request" type="com.liu.vo.Employee"/>
<%--
  Created by IntelliJ IDEA.
  User: L
  Date: 2019/8/1
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>查询成功</title>
</head>
<body>
    EmployeeId : ${employee.employeeId} <br>
    EmployeeName : ${employee.employeeName} <br>
    DepartNum : ${employee.departNum} <br>
    DepartId : ${department.departId} <br>
    DepartName : ${department.departName} <br>
</body>
</html>
