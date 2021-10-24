<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Student Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/StudentCrud_war/UrlToReachResourcesFolder/css/app-style-sheet.css">
</head>
<body>
    <h1 align="center">Students</h1>
    <hr/>
    <div class="container">
        <form action="/StudentCrud_war/addStudent">
            <input type="submit" value="Add" class="btn btn-success">
        </form>
        <table class="table table-striped">
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
            <td><a href="/StudentCrud_war/updateStudent?userId=${student.id}" class="link-primary">Update</a></td>
            <td><a href="/StudentCrud_war/deleteStudent?userId=${student.id}" onclick="if(!confirm('Are you sure you want to delete this student?')) return false" class="link-danger">Delete</a></td>
            </tr>
        </c:forEach>
        </table>
        <br/><br/>
        <img alt="students.png" src="/StudentCrud_war/UrlToReachResourcesFolder/images/students.png">
    </div>
</body>
</html>
