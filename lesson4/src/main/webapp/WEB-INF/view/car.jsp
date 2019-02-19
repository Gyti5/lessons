<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Examples</title>
</head>
<body>

<h3>Welcome, Enter The Car Details</h3>
<form:form method="POST"
           action="/add-car" modelAttribute="car">
    <table>
        <tr>
            <td><form:label path="make">Make</form:label></td>
            <td><form:input path="make"/></td>
        </tr>
        <tr>
            <td><form:label path="model">Model</form:label></td>
            <td><form:input path="model"/></td>
        </tr>

        <tr>
            <td><form:label path="year">Year</form:label></td>
            <td><form:input path="year"/></td>
        </tr>
        <tr>
        <div>

    Engine type:
    <select path="engine" name="Engine:" >
        <option  value="Diesel">Diesel</option>
        <option value="Gasoline">Gasoline</option>
        <option value="Electric">Electric</option>

    </select>
</div>
        </tr>

        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
