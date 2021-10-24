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
            <td><a href="/StudentCrud_war/updateStudent?userId=${student.id}">Update</a></td>
            <td><a href="/StudentCrud_war/deleteStudent?userId=${student.id}" onclick="if(!confirm('Are you sure you want to delete this student?')) return false">Delete</a></td>
            </tr>
        </c:forEach>
        </table>
    </div>
</body>
</html>
