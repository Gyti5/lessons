<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="lt.baltictalents.lesson2.app.UserInfoBean" %>
<html>
<head>
    <title>User input</title>
    <style>
        body {
            background-image: url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRS6WovUIz_d17vwy9PIAI4F4H405f8gDl4EQl8Me_47bTjJlWw");
        }
    </style>

</head>
<body>
<%
    if (request.getAttribute("userInfoBean") != null) {
        UserInfoBean userInfoBean = (UserInfoBean) request.getAttribute("userInfoBean");
%>
<div>
    <ul style="color:white">
        <li>Kebulo tipas: <c:out value="${userInfoBean.type}"/></li>
        <li>Metai: <c:out value="${userInfoBean.year}"/></li>
        <li>Variklio tipas: <c:out value="${userInfoBean.engine}"/></li>
        <li>Gamintojas: <c:out value="${userInfoBean.make}"/></li>
        <li>Galia(kW): <c:out value="${userInfoBean.power}"/></li>
    </ul>

<%
    } else {
        response.sendRedirect("user-input");
    }
%>
    </div>
</body>
</html>
