<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Experiment 6 - JSP with JSTL</title>
</head>
<body>
    <h1>JSP with JSTL Experiment</h1>

    <c:set var="studentName" value="Aman" />
    <c:set var="course" value="Java Web Programming" />

    <h2>Student Details</h2>
    <p>Name: <c:out value="${studentName}" /></p>
    <p>Course: <c:out value="${course}" /></p>

    <c:if test="${not empty studentName}">
        <p>Student information displayed successfully!</p>
    </c:if>
</body>
</html>