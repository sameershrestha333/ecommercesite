<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">

    <div class="container">

        <div class="page-header">
            <h1>Customer</h1>
            <p class="lead">Customer Details</p>
        </div>
        <form:form commandName="order" class="form-horizontal">
        <h3>Basic Info </h3>

        <div class="form-group">
            <label for="customerName">Name</label>
            <form:input path="cart.customer.customerName" placeholder="Name" id="customerName" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="email">Email</label>
            <form:input path="cart.customer.customerEmail" placeholder="Email" id="email" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="phone">Phone</label>
            <form:input path="cart.customer.customerPhone" placeholder="Phone" id="phone" class="form-Control"/>
        </div>

        <!-- end of Basic Info-->

        <h3>Billing Address </h3>
        <div class="form-group">
            <label for="billingStreet">Street Name</label>
            <form:input path="cart.customer.billingAddress.streetName" placeholder="Street Name" id="billingStreet" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingApartmentNumber">Apartment Number</label>
            <form:input path="cart.customer.billingAddress.apartmentNumber" placeholder="Apartment Number" id="billingApartmentNumber" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="billingCity">City</label>
            <form:input path="cart.customer.billingAddress.city" placeholder="City" id="billingCity" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="billingState">State</label>
            <form:input path="cart.customer.billingAddress.state" placeholder="State" id="billingState" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingCountry">country</label>
            <form:input path="cart.customer.billingAddress.country" placeholder="Country" id="billingCountry" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingZipCode">zipCode</label>
            <form:input path="cart.customer.billingAddress.zipCode" placeholder="zipCode" id="billingZipCode" class="form-Control"/>
        </div>


        <!-- end of billing address -->
        <input type="hidden" name="_flowExecutionKey"/>

        <br><br>


        <input type="submit" value="Next" class="btn btn-default" name="_eventId_customerInfoCollected"/>
        <button  class="btn btn-default" name="_eventId_cancel">Cancel</button>


        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp" %>