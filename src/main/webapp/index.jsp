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
<style>
    body{
        background-image: url('https://cdn.discordapp.com/attachments/530696124349284382/950014275714420746/blue_stylish_halftone_comic_zoom_background.jpg');
        background-position: center;
    }
</style>
<body>
<div class="text-center">
        <div class="text-center">
            <img src="https://cdn.discordapp.com/attachments/530696124349284382/950014240322891826/Fichier_2Hero_12.png" width="50%" height="auto" />
        </div>
        <a href="<c:url value="add-hero"/>" ><button class="btn btn-primary">Ajouter un héros</button></a>
        <a href="<c:url value="add-city" />"><button class="btn btn-secondary">Ajouter une ville</button></a>
        <a href="<c:url value="add-alert"/>"><button class="btn btn-danger">ALED !</button></a>
</div>

</body>
</html>