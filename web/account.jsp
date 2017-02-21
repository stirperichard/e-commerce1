<!--
Au<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<%
    String tipo = request.getParameter("type");
%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Swim Wear a E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template | Account ::
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
    <script src="js/imagezoom.js"></script>

    <!-- FlexSlider -->
    <script defer src="js/jquery.flexslider.js"></script>
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen"/>

    <script>
        // Can also be used with $(document).ready()
        $(window).load(function () {
            $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
            });
        });
    </script>


</head>
<body>
<!--header-->
<%@ include file="header_menu.jsp" %>
<!--header-->
<script src="countries.js"></script>
<div class="content">
    <!-- registration -->
    <div class="main-1">
        <div class="container">
            <div class="register">
                <form action="send_registration.jsp">
                    <div class="register-top-grid">
                        <h3>PERSONAL INFORMATION</h3>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <span>First Name<label>*</label></span>
                            <input type="text" name="name" id="name" required>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Last Name<label>*</label></span>
                            <input type="text" name="surname" id="surname" required>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Email Address<label>*</label></span>
                            <input type="text" name="mail" id="mail" required>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Confirm Email Address<label>*</label></span>
                            <input type="text" name="confirm_mail" id="confirm_mail" required>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Password<label>*</label></span>
                            <input type="password" name="password" id="password" required>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Confirm Password<label>*</label></span>
                            <input type="password" name="confirm_password" id="confirm_password" required>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Username<label>*</label></span>
                            <input type="text" name="username" id="username" required>
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Address<label>*</label></span>
                            <input type="text" name="address" id="address" required>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Address 2<label>*</label></span>
                            <input type="text" name="address2" id="address2">
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Country<label>*</label></span>
                            <form>
                                <select id="country" name="country" required></select>
                            </form>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>State<label>*</label></span>
                            <form>
                                <select name="state" id="state" required></select>
                            </form>
                        </div>

                        <script language="javascript">
                            populateCountries("country", "state");
                        </script>

                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>City<label>*</label></span>
                            <input type="text" name="city" id="city" required>
                        </div>
                        <div style="visibility: hidden">
                            <span>Type<label>*</label></span>
                            <input type="text" name="type" id="type" value=<%=tipo%>>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Postal Code CAP<label>*</label></span>
                            <input type="tel" name="cap" id="cap" required>
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <span>Telephone<label>*</label></span>
                            <input type="tel" name="telephone" id="telephone">
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <span>Website<label></label></span>
                            <input type="text" name="website" id="website">
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <span>Paypal Account<label>*</label></span>
                            <input type="email" name="paypal" id="paypal">
                        </div>
                        <div class="clearfix"></div>
                    </div>
                </form>
                <div class="clearfix"></div>
                <br><br>
                <div class="register-but">
                    <form>
                        <input type="submit" value="submit">
                        <div class="clearfix"></div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- registration -->

    <%@ include file="email_subscription_toolbar.jsp" %>
</div>

<!--footer-->
<%@ include file="footer_menu.jsp" %>
<!--footer-->

</body>
</html>