<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<div class="container-wrapper">

    <div class="container" ng-app="">

        <div class="page-header">
            <h1>Register Customer</h1>
            <p class="lead">Please fill in your information below !</p>
        </div>
        <form:form name="registerForm" action="${pageContext.request.contextPath}/register" method="POST" commandName="customer">


            <p>My first expression: {{ 5 + 5 }}</p>

            <p><b>Dirty:</b>{{registerForm.customerName.$dirty}}</p>
            <p><b>Pristine :</b>{{registerForm.customerName.$pristine }}</p>
            <p><b>Valid :</b>{{registerForm.customerName.$valid }}</p>
                <label>For email</label>
        <p><b>Dirty:</b>{{registerForm.customerEmail.$dirty}}</p>
        <p><b>Pristine :</b>{{registerForm.customerEmail.$pristine }}</p>
        <p><b>Valid :</b>{{registerForm.customerEmail.$valid }}</p>


        <div class="alert alert-danger" role="alert" ng-show="registerForm.customerName.$dirty && !registerForm.customerName.$valid">
            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
            <span class="sr-only">Error:</span>
            Enter a valid Name !
        </div>


        <div class="alert alert-danger" role="alert" ng-show="registerForm.customerEmail.$dirty && !registerForm.customerEmail.$valid">
            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
            <span class="sr-only">Error:</span>
            Enter a valid mailing address !
        </div>


        <div class="alert alert-danger" role="alert" ng-show="registerForm.customerPhone.$dirty && !registerForm.customerPhone.$valid">
            <span class="glyphicon glyphicon-exclamation-sign" aria-hidden="true"></span>
            <span class="sr-only">Error:</span>
            Enter a valid phone number !
        </div>

        <h3>Basic Info </h3>

        <div class="form-group">
            <label for="customerName">Name</label>
            <form:errors path="customerName" cssStyle="color: red"/>
            <form:input ng-model="customerName" type="text" ng-pattern="/^[a-zA-Z ]*$/" path="customerName" placeholder="Name" id="customerName" class="form-Control" required="true" />
        </div>

        <div class="form-group">
            <label for="customerEmail">Email</label>
            <span style="color: red">${emailMsg}</span>
            <form:errors path="customerEmail" cssStyle="color: red"/>

            <form:input type="email"  ng-model="customerEmail" path="customerEmail" placeholder="Email" id="email" class="form-Control" required="true"/>
        </div>


        <div class="form-group">
            <label for="customerPhone">Phone</label>
            <form:errors path="customerPhone" cssStyle="color:red"/>

            <form:input required="true"  ng-model="customerPhone" ng-pattern="/^[1-9]{1}[0-9]{9}$/"  path="customerPhone" placeholder="Phone" id="phone" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="username">User Name</label>

            <span style="color: red">${userNameMsg}</span>
            <form:errors path="username" cssStyle="color:red"/>
            <form:input path="username" placeholder="User name" id="username" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <form:errors path="password" cssStyle="color:red"/>

            <form:password path="password" placeholder="Password" id="password" class="form-Control"/>
        </div>

        <!-- end of Basic Info-->

        <h3>Billing Address </h3>
        <div class="form-group">
            <label for="billingStreet">Street Name</label>
            <form:input path="billingAddress.streetName" placeholder="Street Name" id="billingStreet" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="billingApartmentNumber">Apartment Number</label>
            <form:input path="billingAddress.apartmentNumber" placeholder="Apartment Number" id="billingApartmentNumber" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="billingCity">City</label>
            <form:input path="billingAddress.city" placeholder="City" id="billingCity" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="billingState">State</label>
            <form:input path="billingAddress.state" placeholder="State" id="billingState" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingCountry">country</label>
            <form:input path="billingAddress.country" placeholder="Country" id="billingCountry" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="billingZipCode">zipCode</label>
            <form:input path="billingAddress.zipCode" placeholder="zipCode" id="billingZipCode" class="form-Control"/>
        </div>
        
        
        <!-- end of billing address -->
        
        <h3>Shipping Address </h3>
        
        
        <div class="form-group">
            <label for="shippingStreet">Street Name</label>
            <form:input path="shippingAddress.streetName" placeholder="Street Name" id="shippingStreet" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="shippingApartmentNumber">Apartment Number</label>
            <form:input path="shippingAddress.apartmentNumber" placeholder="Apartment Number" id="shippingApartmentNumber" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="shippingCity">City</label>
            <form:input path="shippingAddress.city" placeholder="City" id="shippingCity" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="shippingState">State</label>
            <form:input path="shippingAddress.state" placeholder="State" id="shippingState" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="shippingCountry">country</label>
            <form:input path="shippingAddress.country" placeholder="Country" id="shippingCountry" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="shippingZipCode">zipCode</label>
            <form:input path="shippingAddress.zipCode" placeholder="ZipCode" id="shippingZipCode" class="form-Control"/>
        </div>

        <br><br>


        <input type="submit" ng-click="registerForm.customerEmail.$valid" value="Submit" class="btn btn-default">

        <a href="<c:url value="/"/>" class="btn btn-default">Cancel</a>

        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp" %>