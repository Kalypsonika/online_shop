<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">

    <%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

    <%--<jsp:include page="/bootstrap"/>--%>

</head>

<body>

<tiles:insertAttribute name="body"/>

<div class="confirm-box"></div>

</body>

</html>