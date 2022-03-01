<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://raw.githubusercontent.com/IanLunn/Hover/master/css/hover-min.css"/>
    <link rel="stylesheet" type="text/css" href="assets/styles.css">
</head>
<body>
<h1 class="text-center">Plateforme de secours</h1>
<div class="ligne">
    <div class="colonne text-center">
        <a href="<c:url value="add-hero"/>" >Ajouter un héros</a>
        <a href="<c:url value="add-alert"/>">Déclarer un incident</a>
    </div>
    <div class="colonne text-center">
        <a href="<c:url value="add-city" />">Ajouter une ville</a>

    </div>
</div>

</body>
</html>