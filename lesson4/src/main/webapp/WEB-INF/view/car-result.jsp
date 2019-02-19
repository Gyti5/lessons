<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title></title>
</head>
<body>

<h3>Your car:</h3>
<table>
    <tr>
<<<<<<< HEAD:lesson4/src/main/webapp/WEB-INF/view/car-result.jsp
        <td>Make :</td>
        <td><c:out value="${make}"/></td>
=======
        <td>Name :</td>
        <td>${name}</td>
>>>>>>> 7157aa56082d75a4641b70e1a1bf4926aaa370e8:lesson4/src/main/webapp/WEB-INF/view/employee-result.jsp
    </tr>
    <tr>
        <td>Model :</td>
        <td><c:out value="${model}"/></td>
    </tr>
    <tr>
        <td> Year :</td>
        <td>${year}</td>
    </tr>
    <tr>
        <td>Engine :</td>
        <td><c:out value="${engine}"/></td>
    </tr>
</table>

</body>
</html>
