<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<div class="container-wrapper">

    <div class="container">
        <section>

            <div class="jumbotron">
                <div class="container">
                    <h1>Thank you for your business!</h1>
                </div>
                <p>Your order will be shipped in two business days!</p>

            </div>
        </section>

        <section class="container">
            <p>


                <a href="<spring:url value="/"/> " class="btn btn-default">OK</a>
            </p>
        </section>

    </div>

</div>
<%@include file="/WEB-INF/views/template/footer.jsp" %>