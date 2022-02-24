<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
</h1>
<br/>
<a href="hello-servlet">test</a>

<c:forEach var="item" items="${allIncidents}">
    <p>${ item.label }</p>
</c:forEach>
<form method="post" action="${pageContext.request.contextPath}/hero">
    <label for="heroName">Nom</label>
    <input id="heroName"/>
</form>
</body>
</html>