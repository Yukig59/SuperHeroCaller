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
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body class="bg-info text-center">
<h1 class="text-center text-light">Liste des héros inscrits</h1>
<a href="<c:url value="/"/>"><button class="btn btn-sm btn-primary text-center">Retour</button></a>
<span id="success-alert" >
        <c:if test="${message != null}">
           <div class="alert alert-success alert-dismissible fade show w-50 m-auto" role="alert">
            ${message}
            <button type="button" class="close" data-dismiss="alert" aria-label="Close" style="float: right">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
        </c:if>
    </span>
<div class="d-flex justify-content-evenly ">
    <c:forEach var="item" items="${heroList}">
    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title">${item.name}</h5>
            <h6 class="card-subtitle mb-2 text-muted">0${item.telephone}</h6>
            <p class="card-text"><c:forEach var="incident" items="${incidentList}">
                <c:if test="${incident.id == item.incident1}">
                    ${incident.label}
                </c:if>
            </c:forEach> </p>
            <p class="card-text"><c:forEach var="incident" items="${incidentList}">
                <c:if test="${incident.id == item.incident2}">
                    ${incident.label}
                </c:if>
            </c:forEach> </p>
            <p class="card-text"><c:forEach var="incident" items="${incidentList}">
                <c:if test="${incident.id == item.incident3}">
                    ${incident.label}
                </c:if>
            </c:forEach> </p>

        </div>
    </div>
    </c:forEach>
</div>
</body>
</html>
