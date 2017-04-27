<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="container-wrapper">

    <div class="container">
        <section>

            <div class="jumbotron">
                <div class="container">
                    <h1 class="alert alert-danger"> Checkout Cancelled</h1>
                </div>
                <p>Your checkout process is cancelled. You may continue shopping.</p>

            </div>
        </section>

        <section class="container">
            <p>


                <a href="<spring:url value="/product/productList"/> " class="btn btn-default">Product</a>
            </p>
        </section>

    </div>

</div>
<%@include file="/WEB-INF/views/template/footer.jsp" %>