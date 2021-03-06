<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="com.epam.kinorating.langbundle.text" />
<html>
<head>
    <title>Found movies</title>
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:600,300|Oswald:400" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="/resources/css/standardize.css">
    <link rel="stylesheet" href="/resources/css/home-style.css">
</head>
<body>
    <jsp:include page="_header.jsp"></jsp:include>
    <div class="main">
        <c:forEach items="${movies}" var="movie">
            <c:if test="${language ne 'en'}">
                <div class="content content-1 clearfix">
                    <a href="controller?command=goToMovie&movieId=${movie.id}"><p class="name name-1">${movie.name_ru}</p></a>
                    <img class="image image-1" src="resources/images/shawshank.jpg">
                    <p class="title title-1">${movie.title_ru}</p>
                </div>
            </c:if>
            <c:if test="${language eq 'en'}">
                <div class="content content-1 clearfix">
                    <a href="controller?command=goToMovie&movieId=${movie.id}"><p class="name name-1">${movie.name_en}</p></a>
                    <img class="image image-1" src="resources/images/shawshank.jpg">
                    <p class="title title-1">${movie.title_en}</p>
                </div>
            </c:if>
        </c:forEach>
    </div>
    <jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>
