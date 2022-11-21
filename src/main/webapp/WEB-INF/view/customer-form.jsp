<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>
<head>
    <title>Customer Registration </title>
    <style>
        .error{color:red}
    </style>
</head>
<body>
    <i> Fill out the form. Asterisk (*) means required. </i>
    <br><br>
    <form:form action="processForm" modelAttribute="customer">
        First Name: <form:input path="firstName"/>
        <br><br>
        Last Name (*): <form:input path="lastName"/>
        <form:errors path="lastName" ccClass="error"/>
        <br><br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</htm>