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
              
                <h3>Shipping Address </h3>
                <div class="form-group">
                    <label for="shippingStreet">Street Name</label>
                    <form:input path="cart.customer.shippingAddress.streetName" placeholder="Street Name" id="shippingStreet" class="form-Control"/>
                </div>

                <div class="form-group">
                    <label for="shippingApartmentNumber">Apartment Number</label>
                    <form:input path="cart.customer.shippingAddress.apartmentNumber" placeholder="Apartment Number" id="shippingApartmentNumber" class="form-Control"/>
                </div>


                <div class="form-group">
                    <label for="shippingCity">City</label>
                    <form:input path="cart.customer.shippingAddress.city" placeholder="City" id="shippingCity" class="form-Control"/>
                </div>


                <div class="form-group">
                    <label for="shippingState">State</label>
                    <form:input path="cart.customer.shippingAddress.state" placeholder="State" id="shippingState" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="shippingCountry">country</label>
                    <form:input path="cart.customer.shippingAddress.country" placeholder="Country" id="shippingCountry" class="form-Control"/>
                </div>
                <div class="form-group">
                    <label for="shippingZipCode">zipCode</label>
                    <form:input path="cart.customer.shippingAddress.zipCode" placeholder="zipCode" id="shippingZipCode" class="form-Control"/>
                </div>


                <!-- end of shipping address -->
                <input type="hidden" name="_flowExecutionKey"/>

                <br><br>
                <button  class="btn btn-default" name="_eventId_backToCollectCustomerInfo">Back</button>


                <input type="submit" value="Next" class="btn btn-default" name="_eventId_shippingDetailCollected"/>
                <button  class="btn btn-default" name="_eventId_cancel">Cancel</button>


                </form:form>


        <%@include file="/WEB-INF/views/template/footer.jsp" %>

