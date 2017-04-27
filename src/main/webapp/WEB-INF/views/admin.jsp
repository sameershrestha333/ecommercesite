<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@include file="/WEB-INF/views/template/header.jsp" %>
<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">

    <div class="container">

        <div class="page-header">
            <h1>Administrator Home Page</h1>
            <p class="lead">This is the administrator home page !</p>
        </div>
        <c:if test="${pageContext.request.userPrincipal.name != null}">

        <h2>
            Welcome : ${pageContext.request.userPrincipal.name} | <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>
        </h2>


        </c:if>

        <%--<c:if test="${pageContext.request.userPrincipal.nam!=null}">--%>

        <%--<h2>--%>
            <%--Welcome : ${pageContext.request.userPrincipal.name}  | <a href="<c:url value="/j_spring_security_logout"/>">Logout</a>--%>
        <%--</h2>--%>
        <%--</c:if>--%>


        <h3>
            <a href="<c:url value="/admin/productInventory"/>">Product Inventory</a>
        </h3>
        <p>Here you can view, check and modify the product inventory!</p>

        <br>

        <h3>
            <a href="<c:url value="/admin/customer"/>">Customer Management</a>
        </h3>
        <p>Here you can view the cusomer information!</p>


<%@include file="/WEB-INF/views/template/footer.jsp" %>