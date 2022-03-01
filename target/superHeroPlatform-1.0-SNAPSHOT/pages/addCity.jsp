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
    <title>Ajouter une ville</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/add-city">
    <label for="name">Ville</label>
    <input id="name" name="name"/>
    <br>
    <label  for="longitude">Longitude</label>
    <input id="longitude" name="longitude"/>
    <br>
    <label for="latitude">Latitude</label>
    <input id="latitude" name="latitude"/>
    <br>
    <input type="submit"value="Valider"/>
</form>
</body>
</html>
