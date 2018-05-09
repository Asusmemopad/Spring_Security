<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Top repers</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>

<form action="${pageContext.request.contextPath}/login" method="post">
    <p>Normal text field.
        <input type="text" name="login" /></p>

    <p>Secret text field.
        <input type="password" name="password" /></p>

    <p>Submit button.
        <input type="submit" name="submit" value="submit" /></p>
    <p>Single-selection checkbox.
        <input type="checkbox" name="remember-me"/> Agree?</p>
</form>

${error}
</body>
</html>