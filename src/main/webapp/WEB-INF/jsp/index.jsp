<%--
  Created by IntelliJ IDEA.
  User: 姬厚望
  Date: 2019/3/7
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>首页</title>
    <style type="text/css">
        *{margin: 0px; padding: 0px;}
        table{width:800px; margin: 0px auto; border-collapse: collapse; text-align: center;}
        tr{height:50px; cursor: pointer;}
        thead tr{background-color: #ccc;}
        tbody tr:nth-of-type(odd){background-color: #FF88C2;}
        tbody tr:nth-of-type(even){background-color: #cdf;}
    </style>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>姓名</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${stuList}" var="s">
        <tr>
            <td>${s.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
