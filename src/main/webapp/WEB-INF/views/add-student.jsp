<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Management</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="/StudentCrud_war/UrlToReachResourcesFolder/css/app-style-sheet.css">
</head>
<body>
    <h1 align="center">Add Student</h1>
    <hr/>
    <form:form action="save-student" method="POST" modelAttribute="studentDTO">
    <div align="center">
        <form:hidden path="id"/>
        <p>
            <label>Name : </label>
            <form:input path="name"/>
        </p>
        <p>
            <label>Mobile : </label>
            <form:input path="mobile"/>
        </p>
        <p>
            <label>Country : </label>
            <form:input path="country"/>
        </p>
        <p>
            <input type="submit" value="Save" class="btn btn-success">
        </p>
    </div>
    </form:form>
</body>
</html>
