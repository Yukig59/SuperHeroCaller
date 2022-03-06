<%--
  Created by IntelliJ IDEA.
  User: Archerus
  Date: 24/02/2022
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>
<html>
<head>
    <title>All Heros</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body class="bg-info text-center">
<h1 class="text-center text-light">Liste des héros inscrits</h1>
<a href="<c:url value="/"/>"><button class="btn btn-sm btn-primary text-center">Retour</button></a>
<c:forEach var="item" items="${heroList}">
    <p class="text-light">${ item.name } (${item.incident1} | ${item.incident2} | ${item.incident3})</p>
</c:forEach>
</body>
</html>
