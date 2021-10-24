<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Management</title>
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
            <input type="submit" value="Save">
        </p>
    </div>
    </form:form>
</body>
</html>
