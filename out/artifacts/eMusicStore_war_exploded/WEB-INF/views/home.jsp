<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@include file="/WEB-INF/views/template/header.jsp" %>


<!-- Carousel
================================================== -->
<div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <img class="first-slide home-image"
                 src="<c:url value="/resources/images/back1.jpg"/>"
                 alt="First slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Welcome to the myOnlineShop</h1>
                    <p>Here you can browser and buy instrument, Records and music related Accessories. Order Now for
                        Your Amazing New Kid.</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="second-slide home-image"
                 src="<c:url value="/resources/images/back2.jpg"/>"
                 alt="Second slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>Facts You Should Know Abot Music</h1>
                    <p>Music brings joy, to all of our hearts. It's one of those, emotional arts.</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a></p>
                </div>
            </div>
        </div>
        <div class="item">
            <img class="third-slide home-image"
                 src="<c:url value="/resources/images/back3.jpg"/>"
                 alt="Third slide">
            <div class="container">
                <div class="carousel-caption">
                    <h1>It's A Jass Affair</h1>
                    <p>Through ups and downs,Somehow I manage to survive in my life.</p>
                    <p><a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a></p>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>
<!-- /.carousel -->


<!-- Marketing messaging and featurettes
================================================== -->
<!-- Wrap the rest of the page in another container to center all the content. -->

<div class="container marketing">

    <!-- Three columns of text below the carousel -->
    <div class="row">
        <div class="col-lg-4">
            <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Instrument"/>"
               role="button">

                <img title="Instrument" src="<c:url value="/resources/images/instrument.jpg"/>" alt="Instrument"
                     width="140" height="140"/>
            </a>

            <h2>Instrument</h2>
            <p>
                Well crafted and delicate Instruments.
            </p>
        </div>

        <div class="row">
            <div class="col-lg-4">
                <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Record"/>"
                   role="button">

                    <img title="Record" src="<c:url value="/resources/images/record.jpg"/>" alt="Record" width="140"
                         height="140"/>
                </a>

                <h2>Record</h2>
                <p>
                    An exceptional collection of music records in favor of teh traditional and modern genre of java.
                </p>
            </div>


            <div class="row">
                <div class="col-lg-4">
                    <a class="btn btn-default" href="<c:url value="/product/productList?searchCondition=Accessory"/>"
                       role="button">

                        <img title="Accessories" src="<c:url value="/resources/images/accessory.jpg"/>"
                             alt="Accessories"
                             width="140" height="140"/>
                    </a>

                    <h2>Accessories</h2>
                    <p>
                        All musical and related geeky goods.
                    </p>
                </div>
            </div>

            <script>
                $(document).ready(function () {
                    $(window).scroll(function () {
                        if($)
                    });
                });
            </script>

<%@include file="/WEB-INF/views/template/footer.jsp" %>