<jsp:useBean id="city" scope="request" type="com.archeruss.superheroplatform.models.CityModel"/>
<%--
  Created by IntelliJ IDEA.
  User: Archerus
  Date: 04/03/2022
  Time: 07:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Carte des héros à proximité</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
          integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
          crossorigin=""/>

    <style>
        #map { height: 50%; width: 80%; margin-right: auto; margin-left: auto; }
    </style>
</head>
<body class="bg-info">
<h1 class="text-center text-light">Carte des héros disponibles</h1>
<div class="text-center">
    <a href="<c:url value="/"/>"><button class="btn btn-sm btn-primary ">Retour</button></a>
</div>
<div id="map"></div>
<script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"
        integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
        crossorigin=""></script>
<script>
    var greenIcon = new L.Icon({
        iconUrl: 'https://raw.githubusercontent.com/pointhi/leaflet-color-markers/master/img/marker-icon-2x-green.png',
        shadowUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-shadow.png',
        iconSize: [25, 41],
        iconAnchor: [12, 41],
        popupAnchor: [1, -34],
        shadowSize: [41, 41]
    });
    var redIcon = new L.Icon({
        iconUrl: 'https://raw.githubusercontent.com/pointhi/leaflet-color-markers/master/img/marker-icon-2x-red.png',
        shadowUrl: 'https://cdnjs.cloudflare.com/ajax/libs/leaflet/0.7.7/images/marker-shadow.png',
        iconSize: [25, 41],
        iconAnchor: [12, 41],
        popupAnchor: [1, -34],
        shadowSize: [41, 41]
    });
    function initMap() {

        let map = L.map('map').setView([<c:out value="${city.lat}"></c:out> , <c:out value="${city.lon}"></c:out>], 9);
        L.tileLayer('https://{s}.tile.openstreetmap.fr/osmfr/{z}/{x}/{y}.png', {
            // Il est toujours bien de laisser le lien vers la source des données
            attribution: 'données © <a href="//osm.org/copyright">OpenStreetMap</a>/ODbL - rendu <a href="//openstreetmap.fr">OSM France</a>',
            minZoom: 1,
            maxZoom: 50
        }).addTo(map);
        var circle = L.circle([<c:out value="${city.lat}"></c:out> , <c:out value="${city.lon}"></c:out>], {
            color: 'blue',
            fillColor: '#85D5FF',
            fillOpacity: 0.5,
            radius: 50000
        }).addTo(map);
        let marker = L.marker([<c:out value="${city.lat}"></c:out>, <c:out value="${city.lon}"></c:out>],{
            icon: redIcon
        }).addTo(map);
        marker.bindPopup("${city.name} : ${incident.label}");

        <%--for(let hero in <c:out value="${nearHeros}"></c:out>){--%>
        <%--    let heroMarker;--%>
        <%--    heroMarker = L.marker([<c:out value="${nearHeros.latitude}"></c:out>,--%>
        <%--        <c:out value="${nearHeros.longitude}"></c:out>]).addTo(map);--%>
        <%--}--%>
        <c:forEach var="hero" items="${nearHeros}">
        L.marker([<c:out value="${hero.latitude}"></c:out>, <c:out value="${hero.longitude}"></c:out>], {
            icon: greenIcon
        }).bindPopup("<b>${hero.name}</b><br/>0${hero.telephone}").addTo(map);

        </c:forEach>
    }
    window.onload = function(){
        // Fonction d'initialisation qui s'exécute lorsque le DOM est chargé
        initMap();
    };

</script>
</body>
</html>
