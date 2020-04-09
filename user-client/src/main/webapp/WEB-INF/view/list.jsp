<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/1
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>商品id</td>
            <td>商品编号</td>
            <td>商品价格</td>
            <td>上架时间</td>
        </tr>
        <c:forEach items="${glist}" var="s">
            <tr>
                <td>${s.gid}</td>
                <td>${s.gname}</td>
                <td>${s.price}</td>
                <td><fmt:formatDate value="${s.datea}"></fmt:formatDate></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
