<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Student Management</title>
</head>
<body>
    <h1 align="center">Students</h1>
    <hr/>
    <div align="center">
        <form action="/StudentCrud_war/addStudent">
            <input type="submit" value="Add">
        </form>
        <table border="1">
            <thead>
                <tr>
                    <td>Id</td>
                    <td>Name</td>
                    <td>Mobile</td>
                    <td>Country</td>
                </tr>
            </thead>
        <c:forEach items="${students}" var="student">
            <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.mobile}</td>
            <td>${student.country}</td>
            </tr>
        </c:forEach>
        </table>
    </div>
</body>
</html>
