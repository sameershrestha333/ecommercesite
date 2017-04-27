<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>

<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container-wrapper">

    <div class="container">

        <div class="page-header">
            <h1>Add Product</h1>
            <p class="lead">Fill the below information to add a product !</p>
        </div>
        <form:form action="${pageContext.request.contextPath}/admin/product/addProduct" method="post" commandName="product" enctype="multipart/form-data" >



        <%--<c:if test=" ${product.productId}==null">--%>
        <%--<div class="form-group">--%>
            <%--<form:hidden path="productId"/>--%>
        <%--</div>--%>
        <%--</c:if>--%>


        <div class="form-group">
            <label for="name">Name</label>
            <form:errors path="productName" cssStyle="color: #ff4740"/>
            <form:input path="productName"  placeholder="Product Name" id="name" class="form-Control"/>
        </div>


        <div class="form-group">
            <label for="category">Category</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="instrument"/>Instrument</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category"
                                                             value="record"/>Record</label>
            <label class="checkbox-inline"><form:radiobutton path="productCategory" id="category" value="accessory"/>Accessory</label>
        </div>

        <div class="form-group">
            <label for="description">Description</label>
            <form:textarea path="productDescription"  id="description" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="price">Price</label>
            <form:errors path="productPrice" cssStyle="color: #ff4740"/>

            <form:input path="productPrice" id="price" class="form-Control"/>
        </div>

        <div class="form-group">
            <label for="condition">Condition</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition"
                                                             value="new"/>New</label>
            <label class="checkbox-inline"><form:radiobutton path="productCondition" id="condition" value="old"/>Old</label>
        </div>
        <div class="form-group">
            <label for="status">Status</label>
            <label class="checkbox-inline"><form:radiobutton path="productStatus" id="status"
                                                             value="active"/>Active</label> <label
                class="checkbox-inline"><form:radiobutton path="productStatus" id="status"
                                                          value="Inactive"/>Inactive</label>
        </div>


        <div class="form-group">
            <label for="unitInStock">Unit In Stock</label>
            <form:errors path="unitInStock" cssStyle="color: #ff4740"/>

            <form:input path="unitInStock" id="unitInStock" class="form-Control"/>
        </div>
        <div class="form-group">
            <label for="manufacturer">Manufacturer</label>
            <form:input path="productManufacturer" id="manufacturer" class="form-Control"/>
        </div>


        <div class="form-group">
            <label class="control-label" for="productImage">Upload Image</label>
            <form:input path="productImage" id="productImage"  type="file" class="form:input-large"/>
        </div>
        <br><br>


        <input type="submit" value="Submit" class="btn btn-default">

        <a href="<c:url value="/admin/productInventory"/>" class="btn btn-default">Cancel</a>

        </form:form>


<%@include file="/WEB-INF/views/template/footer.jsp" %>