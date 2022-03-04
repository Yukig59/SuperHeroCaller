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
    <link rel="stylesheet" type="text/css" href="assets/styles.css">
</head>
<body class="bg-info">
<a><button class="btn btn-sm btn-primary"><- Retour</button></a>
<h1 class="text-center text-light mt-5">Ajouter un nouveau héros</h1>
<div style="margin-left: 15%;margin-right: 5%;">
    <form method="post" action="${pageContext.request.contextPath}/hero" class="form-control">
        <label for="heroName">Nom</label>
        <input id="heroName" name="heroName" class="form-control"/>
        <br>
        <label for="telephone">N° de téléphone</label>
        <input id="telephone" name="telephone" class="form-control" />
        <br>
        <label  for="longitude">Longitude</label>
        <input id="longitude" name="longitude" class="form-control"/>
        <br>
        <label for="latitude">Latitude</label>
        <input id="latitude" name="latitude" class="form-control"/>
        <br>
        <label for="incident1">Incident 1</label>
        <select id="incident1" name="incident1" class="form-select">
            <c:forEach var="item" items="${allIncidents}">
                <option value="${item.id}">${item.label}</option>
            </c:forEach>
        </select>
        <br>
        <label for="incident2">Incident 2</label>
        <select id="incident2" name="incident2" class="form-select">
            <c:forEach var="item" items="${allIncidents}">
                <option value="${item.id}">${item.label}</option>
            </c:forEach>
        </select>
        <br>
        <label for="incident3">Incident 3</label>
        <select id="incident3" name="incident3" class="form-select">
            <c:forEach var="item" items="${allIncidents}">
                <option value="${item.id}">${item.label}</option>
            </c:forEach>
        </select>
        <input type="submit"value="Valider" class="btn btn-sm btn-success" style="float:left"/>
    </form>
</div>
</body>
</html>
