<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>学生信息列表</title>
</head>
<body>
<table border="1">
    <tr>
        <td>姓名-测试访问地址</td>
        <td>年龄</td>
        <td>性别</td>
        <td>手机号码</td>
        <td>邮箱</td>
        <td>班级ID</td>
    </tr>
    <c:forEach var="list" items="${list}">
        <tr>
            <td>${list.name}</td>
            <td>${list.age}</td>
            <td>${list.gender}</td>
            <td>${list.telephone}</td>
            <td>${list.email}</td>
            <td>${list.classId}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
