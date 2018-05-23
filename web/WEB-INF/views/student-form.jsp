<%--
  Created by IntelliJ IDEA.
  User: iTech
  Date: 5/22/18
  Time: 11:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<head>
    <title>Student Registeration Form</title>
</head>
<body>

    <form:form action="processForm" modelAttribute="student">

        First Name: <form:input path="firstName" />

        <br><br>

        Last Name: <form:input path="lastName" />

        <br><br>

        Country:
        <form:select path="country">
            <form:options items="${student.countryOptions}" />
        </form:select>

        <br><br>

        <input type="submit" value="Submit" />

    </form:form>

</body>
</html>
