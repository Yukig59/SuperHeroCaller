<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>

<!DOCTYPE html>
<html>
<head>
    <title>ALED - Accueil</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="assets/styles.css">
</head>
<body>
<div class="text-center">
    <div class="colonne">
        <h1 class="text-center">ALED App</h1>
        <a href="<c:url value="add-hero"/>" ><button class="btn btn-primary">Ajouter un héros</button></a>
        <a href="<c:url value="add-city" />"><button class="btn btn-secondary">Ajouter une ville</button></a>
        <a href="<c:url value="add-alert"/>"><button class="btn btn-info">ALED !</button></a>
    </div>
</div>

</body>
</html>