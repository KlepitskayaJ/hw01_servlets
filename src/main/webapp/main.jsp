<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>hw1-stlab</title>
</head>
<body>

<c:forEach var="number" items="${requestScope.numbers}">
    <c:out value="${number}"/><br>
</c:forEach>

<c:forEach var="sortedNumber" items="${requestScope.sortedNumbers}">
    <c:out value="${sortedNumber}"/><br>
</c:forEach>

<form action="${pageContext.request.contextPath}/" method="post">
    <br><input type="submit" name="button" value="OrderList"/>
</form>
<br>

<br/>
</body>
</html>