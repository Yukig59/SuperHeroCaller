<%--
  Created by IntelliJ IDEA.
  User: Archerus
  Date: 24/02/2022
  Time: 11:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>

<html>
<head>
    <title>Ajouter un héros</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/hero">
    <label for="heroName">Nom</label>
    <input id="heroName" name="heroName"/>
    <br>
    <label for="telephone">N° de téléphone</label>
    <input id="telephone" name="telephone"/>
    <br>
    <label  for="longitude">Longitude</label>
    <input id="longitude" name="longitude"/>
    <br>
    <label for="latitude">Latitude</label>
    <input id="latitude" name="latitude"/>
    <br>
    <label for="incident1">Incident 1</label>
    <select id="incident1" name="incident1">
        <c:forEach var="item" items="${allIncidents}">
            <option value="${item.id}">${item.label}</option>
        </c:forEach>
    </select>
    <br>
    <label for="incident2">Incident 2</label>
    <select id="incident2" name="incident2">
        <c:forEach var="item" items="${allIncidents}">
            <option value="${item.id}">${item.label}</option>
        </c:forEach>
    </select>
    <br>
    <label for="incident3">Incident 3</label>
    <select id="incident3" name="incident3">
        <c:forEach var="item" items="${allIncidents}">
            <option value="${item.id}">${item.label}</option>
        </c:forEach>
    </select>
    <input type="submit"value="Valider"/>
</form>
</body>
</html>
