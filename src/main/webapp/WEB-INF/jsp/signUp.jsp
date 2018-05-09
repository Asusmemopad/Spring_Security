<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Top repers</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

<form action="${pageContext.request.contextPath}/signUp" method="post">
    <p>Normal text field.
        <input type="text" name="firstName" /></p>

    <p>Secret text field.
        <input type="password" name="lastName" /></p>

    <p>Normal text field.
        <input type="text" name="login" /></p>

    <p>Secret text field.
        <input type="password" name="pass" /></p>

    <p>Submit button.
        <input type="submit" name="submit" value="submit" /></p>
</form>
</body>
</html>