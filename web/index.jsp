<%@ page import="com.afjcjsbx.eshop.controller.shoppingcart.ShoppingCartController" %>
<%@ page import="java.util.Date" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Customer" %>
<%@ page import="com.afjcjsbx.eshop.constants.Constants" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Swim Wear a E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template | Home ::
        w3layouts</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/owl.carousel.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content="Swim Wear Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design"/>
    <script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    } </script>
    <script src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
    <!-- shoppingCart -->
    <!-- shoppingCart -->
</head>
<body>
<!--header-->
<%@ include file="header_menu.jsp" %>
<!--header-->
<div class="subscribe">
    <div class="container">
        <div class="subscribe1">
            <h4>Search in eshop</h4>
        </div>
        <div class="subscribe2">
            <form action="search">
                <input type="text" class="text" name="search" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search...';}">
                <input type="submit" value="SEARCH">
            </form>
        </div>
        <div class="clearfix"></div>
    </div>
</div>
<br><br>

<div class="banner-section">
    <div class="container">
        <div class="banner-grids">
            <div class="col-md-6 banner-grid">
                <h2>the latest collections</h2>
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
                    et dolore magna aliqua.</p>
                <a href="products.jsp" class="button"> shop now </a>
            </div>
            <div class="col-md-6 banner-grid1">
                <img src="images/p2.png" class="img-responsive" alt=""/>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<div class="banner-bottom">
    <div class="gallery-cursual">
        <!--requried-jsfiles-for owl-->
        <script src="js/owl.carousel.js"></script>
        <script>
            $(document).ready(function () {
                $("#owl-demo").owlCarousel({
                    items: 3,
                    lazyLoad: true,
                    autoPlay: true,
                    pagination: false,
                });
            });
        </script>
        <!--requried-jsfiles-for owl -->
        <!--start content-slider-->
        <div id="owl-demo" class="owl-carousel text-center">
            <div class="item">
                <img class="lazyOwl" data-src="images/b1.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b2.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b3.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b4.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b1.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b6.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b7.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b1.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b2.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
            <div class="item">
                <img class="lazyOwl" data-src="images/b3.jpg" alt="name">
                <div class="item-info">
                    <h5>Lorem ipsum</h5>
                </div>
            </div>
        </div>
        <!--sreen-gallery-cursual-->
    </div>
</div>
<div class="gallery">
    <div class="container">
        <h3>Featured products</h3>
        <div class="gallery-grids">
            <div class="col-md-3 gallery-grid ">
                <a href="products.jsp"><img src="images/g1.png" class="img-responsive" alt=""/>
                    <div class="gallery-info">
                        <div class="quick">
                            <p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
                        </div>
                    </div>
                </a>
                <div class="galy-info">
                    <p>Amour Women’s Amour...</p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">$95.00</h5>
                        </div>
                        <div class="rating">
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 gallery-grid">
                <a href="products.jsp"><img src="images/g2.png" class="img-responsive" alt=""/>
                    <div class="gallery-info">
                        <div class="quick">
                            <p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
                        </div>
                    </div>
                </a>
                <div class="galy-info">
                    <p>Amour Women’s Amour...</p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">$95.00</h5>
                        </div>
                        <div class="rating">
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 gallery-grid">
                <a href="products.jsp"><img src="images/g3.png" class="img-responsive" alt=""/>
                    <div class="gallery-info">
                        <div class="quick">
                            <p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
                        </div>
                    </div>
                </a>
                <div class="galy-info">
                    <p>Amour Women’s Amour...</p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">$95.00</h5>
                        </div>
                        <div class="rating">
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 gallery-grid">
                <a href="products.jsp"><img src="images/g4.png" class="img-responsive" alt=""/>
                    <div class="gallery-info">
                        <div class="quick">
                            <p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
                        </div>
                    </div>
                </a>
                <div class="galy-info">
                    <p>Amour Women’s Amour...</p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">$95.00</h5>
                        </div>
                        <div class="rating">
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 gallery-grid ">
                <a href="products.jsp"><img src="images/g5.jpg" class="img-responsive" alt=""/>
                    <div class="gallery-info">
                        <div class="quick">
                            <p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
                        </div>
                    </div>
                </a>
                <div class="galy-info">
                    <p>Amour Women’s Amour...</p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">$95.00</h5>
                        </div>
                        <div class="rating">
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 gallery-grid">
                <a href="products.jsp"><img src="images/g6.jpg" class="img-responsive" alt=""/>
                    <div class="gallery-info">
                        <div class="quick">
                            <p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
                        </div>
                    </div>
                </a>
                <div class="galy-info simpleCart_shelfItem">
                    <p>Amour Women’s Amour...</p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">$95.00</h5>
                        </div>
                        <div class="rating">
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 gallery-grid">
                <a href="products.jsp"><img src="images/g7.jpg" class="img-responsive" alt=""/>
                    <div class="gallery-info">
                        <div class="quick">
                            <p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
                        </div>
                    </div>
                </a>
                <div class="galy-info simpleCart_shelfItem">
                    <p>Amour Women’s Amour...</p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">$95.00</h5>
                        </div>
                        <div class="rating">
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="col-md-3 gallery-grid">
                <a href="products.jsp"><img src="images/g8.jpg" class="img-responsive" alt=""/>
                    <div class="gallery-info">
                        <div class="quick">
                            <p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
                        </div>
                    </div>
                </a>
                <div class="galy-info simpleCart_shelfItem">
                    <p>Amour Women’s Amour...</p>
                    <div class="galry">
                        <div class="prices">
                            <h5 class="item_price">$95.00</h5>
                        </div>
                        <div class="rating">
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                            <span>☆</span>
                        </div>

                        <div class="clearfix"></div>
                    </div>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<%@ include file="email_subscription_toolbar.jsp" %>

<!--footer-->
<%@ include file="footer_menu.jsp" %>

<!--footer-->

</body>
</html>