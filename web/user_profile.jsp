<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 07/02/2017
  Time: 15:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--
Au<!--
Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
    <title>Swim Wear a E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template | User Profile :: w3layouts</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all"/>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/owl.carousel.css" rel="stylesheet">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Swim Wear Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template,
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <script src="js/jquery.min.js"></script>
    <!-- shoppingCart -->
    <script src="js/simpleCart.min.js"> </script>
    <!-- shoppingCart -->
    <script type="text/javascript" src="js/bootstrap-3.1.1.min.js"></script>
    <script src="js/imagezoom.js"></script>

    <!-- FlexSlider -->
    <script defer src="js/jquery.flexslider.js"></script>
    <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />

    <script>
        // Can also be used with $(document).ready()
        $(window).load(function() {
            $('.flexslider').flexslider({
                animation: "slide",
                controlNav: "thumbnails"
            });
        });
    </script>



</head>
<body>
<!--header-->
<div class="header">
    <div class="header-top">
        <div class="container">
            <div class="lang_list">
                <select tabindex="4" class="dropdown1">
                    <option value="" class="label" value="">En</option>
                    <option value="1">English</option>
                    <option value="2">French</option>
                    <option value="3">German</option>
                </select>
            </div>
            <div class="top-right">
                <ul>
                    <li class="text"><a href="login.jsp">login</a>
                    <li><div class="shoppingCart box_1">
                        <a href="checkout.jsp">
                            <span class="simpleCart_total"> $0.00 </span> (<span id="simpleCart_quantity" class="simpleCart_quantity"> 0 </span>)
                        </a>
                        <p><a href="javascript:;" class="simpleCart_empty">Empty shoppingCart</a></p>
                        <div class="clearfix"> </div>
                    </div></li>
                </ul>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
    <div class="header-bottom">
        <div class="container">
            <!--/.content-->
            <div class="content white">
                <nav class="navbar navbar-default" role="navigation">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <h1 class="navbar-brand"><a  href="index.jsp">swim wear</a></h1>
                    </div>
                    <!--/.navbar-header-->

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a href="index.jsp">Home</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Men <b class="caret"></b></a>
                                <ul class="dropdown-menu multi-column columns-3">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="products.jsp">Women</a></li>
                                                <li><a class="list1" href="products.jsp">PrettySecrets</a></li>
                                                <li><a class="list1" href="products.jsp">N-Gal</a></li>
                                                <li><a class="list1" href="products.jsp">Lobster</a></li>
                                                <li><a class="list1" href="products.jsp">Citypret</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="products.jsp">Kids</a></li>
                                                <li><a class="list1" href="products.jsp">River Island</a></li>
                                                <li><a class="list1" href="products.jsp">Penny</a></li>
                                                <li><a class="list1" href="products.jsp">Nidhi Munim</a></li>
                                                <li><a class="list1" href="products.jsp">Divaat</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="products.jsp">Men</a></li>
                                                <li><a class="list1" href="products.jsp">Fiesta Clara</a></li>
                                                <li><a class="list1" href="products.jsp">Quiksilver</a></li>
                                                <li><a class="list1" href="products.jsp">Incult</a></li>
                                                <li><a class="list1" href="products.jsp">Proline</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">women <b class="caret"></b></a>
                                <ul class="dropdown-menu multi-column columns-3">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="products.jsp">Women</a></li>
                                                <li><a class="list1" href="products.jsp">PrettySecrets</a></li>
                                                <li><a class="list1" href="products.jsp">N-Gal</a></li>
                                                <li><a class="list1" href="products.jsp">Lobster</a></li>
                                                <li><a class="list1" href="products.jsp">Citypret</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list"  href="products.jsp">Kids</a></li>
                                                <li><a class="list1" href="products.jsp">River Island</a></li>
                                                <li><a class="list1" href="products.jsp">Penny</a></li>
                                                <li><a class="list1" href="products.jsp">Nidhi Munim</a></li>
                                                <li><a class="list1" href="products.jsp">Divaat</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a  class="list" href="products.jsp">Men</a></li>
                                                <li><a class="list1" href="products.jsp">Fiesta Clara</a></li>
                                                <li><a class="list1" href="products.jsp">Quiksilver</a></li>
                                                <li><a class="list1" href="products.jsp">Incult</a></li>
                                                <li><a class="list1" href="products.jsp">Proline</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">kids <b class="caret"></b></a>
                                <ul class="dropdown-menu multi-column columns-3">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="products.jsp">Women</a></li>
                                                <li><a class="list1" href="products.jsp">PrettySecrets</a></li>
                                                <li><a class="list1" href="products.jsp">N-Gal</a></li>
                                                <li><a class="list1" href="products.jsp">Lobster</a></li>
                                                <li><a class="list1" href="products.jsp">Citypret</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a  class="list" href="products.jsp">Kids</a></li>
                                                <li><a class="list1" href="products.jsp">River Island</a></li>
                                                <li><a class="list1" href="products.jsp">Penny</a></li>
                                                <li><a class="list1" href="products.jsp">Nidhi Munim</a></li>
                                                <li><a class="list1" href="products.jsp">Divaat</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="products.jsp">Men</a></li>
                                                <li><a class="list1" href="products.jsp">Fiesta Clara</a></li>
                                                <li><a class="list1" href="products.jsp">Quiksilver</a></li>
                                                <li><a class="list1" href="products.jsp">Incult</a></li>
                                                <li><a class="list1" href="products.jsp">Proline</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li><a href="products.jsp">Top</a></li>
                            <li><a href="products.jsp">Bikini</a></li>
                        </ul>
                    </div>
                    <!--/.navbar-collapse-->
                </nav>
                <!--/.navbar-->
            </div>
            <div class="search-box">
                <div id="sb-search" class="sb-search">
                    <form>
                        <input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
                        <input class="sb-search-submit" type="submit" value="">
                        <span class="sb-icon-search"> </span>
                    </form>
                </div>
            </div>

            <!-- search-scripts -->
            <script src="js/classie.js"></script>
            <script src="js/uisearch.js"></script>
            <script>kk
            new UISearch( document.getElementById( 'sb-search' ) );
            </script>
            <!-- //search-scripts -->
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--header-->
<div class="content">
    <!-- registration -->
    <div class="main-1">
        <div class="container">
            <div class="register">
                <form>
                    <div class="register-top-grid">
                        <h3>PERSONAL INFORMATION</h3>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <span>First Name<label>*</label></span>
                            <input type="text" name="name" id ="name" readonly>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Last Name<label>*</label></span>
                            <input type="text" name="surname" id ="surname" readonly>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Email Address<label>*</label></span>
                            <input type="email" name="mail" id ="mail" readonly>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Confirm Email Address<label>*</label></span>
                            <input type="email" name="confirm_mail" id ="confirm_mail" readonly>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Password<label>*</label></span>
                            <input type="password" name="password" id ="password">
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Confirm Password<label>*</label></span>
                            <input type="password" name="confirm_password" id ="confirm_password">
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Username<label>*</label></span>
                            <input type="text" name="username" id ="username" readonly>
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Address<label>*</label></span>
                            <input type="text" name="address" id ="address">
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Address 2<label>*</label></span>
                            <input type="text" name="address2" id ="address2">
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Country<label>*</label></span>
                            <form name="country" id ="country">
                                <select name="country">
                                    <option value="">Select your country</option>
                                    <option value="Afganistan">Afghanistan</option>
                                    <option value="Albania">Albania</option>
                                    <option value="Algeria">Algeria</option>
                                    <option value="American Samoa">American Samoa</option>
                                    <option value="Andorra">Andorra</option>
                                    <option value="Angola">Angola</option>
                                    <option value="Anguilla">Anguilla</option>
                                    <option value="Antigua &amp; Barbuda">Antigua &amp; Barbuda</option>
                                    <option value="Argentina">Argentina</option>
                                    <option value="Armenia">Armenia</option>
                                    <option value="Aruba">Aruba</option>
                                    <option value="Australia">Australia</option>
                                    <option value="Austria">Austria</option>
                                    <option value="Azerbaijan">Azerbaijan</option>
                                    <option value="Bahamas">Bahamas</option>
                                    <option value="Bahrain">Bahrain</option>
                                    <option value="Bangladesh">Bangladesh</option>
                                    <option value="Barbados">Barbados</option>
                                    <option value="Belarus">Belarus</option>
                                    <option value="Belgium">Belgium</option>
                                    <option value="Belize">Belize</option>
                                    <option value="Benin">Benin</option>
                                    <option value="Bermuda">Bermuda</option>
                                    <option value="Bhutan">Bhutan</option>
                                    <option value="Bolivia">Bolivia</option>
                                    <option value="Bonaire">Bonaire</option>
                                    <option value="Bosnia &amp; Herzegovina">Bosnia &amp; Herzegovina</option>
                                    <option value="Botswana">Botswana</option>
                                    <option value="Brazil">Brazil</option>
                                    <option value="British Indian Ocean Ter">British Indian Ocean Ter</option>
                                    <option value="Brunei">Brunei</option>
                                    <option value="Bulgaria">Bulgaria</option>
                                    <option value="Burkina Faso">Burkina Faso</option>
                                    <option value="Burundi">Burundi</option>
                                    <option value="Cambodia">Cambodia</option>
                                    <option value="Cameroon">Cameroon</option>
                                    <option value="Canada">Canada</option>
                                    <option value="Canary Islands">Canary Islands</option>
                                    <option value="Cape Verde">Cape Verde</option>
                                    <option value="Cayman Islands">Cayman Islands</option>
                                    <option value="Central African Republic">Central African Republic</option>
                                    <option value="Chad">Chad</option>
                                    <option value="Channel Islands">Channel Islands</option>
                                    <option value="Chile">Chile</option>
                                    <option value="China">China</option>
                                    <option value="Christmas Island">Christmas Island</option>
                                    <option value="Cocos Island">Cocos Island</option>
                                    <option value="Colombia">Colombia</option>
                                    <option value="Comoros">Comoros</option>
                                    <option value="Congo">Congo</option>
                                    <option value="Cook Islands">Cook Islands</option>
                                    <option value="Costa Rica">Costa Rica</option>
                                    <option value="Cote DIvoire">Cote D'Ivoire</option>
                                    <option value="Croatia">Croatia</option>
                                    <option value="Cuba">Cuba</option>
                                    <option value="Curaco">Curacao</option>
                                    <option value="Cyprus">Cyprus</option>
                                    <option value="Czech Republic">Czech Republic</option>
                                    <option value="Denmark">Denmark</option>
                                    <option value="Djibouti">Djibouti</option>
                                    <option value="Dominica">Dominica</option>
                                    <option value="Dominican Republic">Dominican Republic</option>
                                    <option value="East Timor">East Timor</option>
                                    <option value="Ecuador">Ecuador</option>
                                    <option value="Egypt">Egypt</option>
                                    <option value="El Salvador">El Salvador</option>
                                    <option value="Equatorial Guinea">Equatorial Guinea</option>
                                    <option value="Eritrea">Eritrea</option>
                                    <option value="Estonia">Estonia</option>
                                    <option value="Ethiopia">Ethiopia</option>
                                    <option value="Falkland Islands">Falkland Islands</option>
                                    <option value="Faroe Islands">Faroe Islands</option>
                                    <option value="Fiji">Fiji</option>
                                    <option value="Finland">Finland</option>
                                    <option value="France">France</option>
                                    <option value="French Guiana">French Guiana</option>
                                    <option value="French Polynesia">French Polynesia</option>
                                    <option value="French Southern Ter">French Southern Ter</option>
                                    <option value="Gabon">Gabon</option>
                                    <option value="Gambia">Gambia</option>
                                    <option value="Georgia">Georgia</option>
                                    <option value="Germany">Germany</option>
                                    <option value="Ghana">Ghana</option>
                                    <option value="Gibraltar">Gibraltar</option>
                                    <option value="Great Britain">Great Britain</option>
                                    <option value="Greece">Greece</option>
                                    <option value="Greenland">Greenland</option>
                                    <option value="Grenada">Grenada</option>
                                    <option value="Guadeloupe">Guadeloupe</option>
                                    <option value="Guam">Guam</option>
                                    <option value="Guatemala">Guatemala</option>
                                    <option value="Guinea">Guinea</option>
                                    <option value="Guyana">Guyana</option>
                                    <option value="Haiti">Haiti</option>
                                    <option value="Hawaii">Hawaii</option>
                                    <option value="Honduras">Honduras</option>
                                    <option value="Hong Kong">Hong Kong</option>
                                    <option value="Hungary">Hungary</option>
                                    <option value="Iceland">Iceland</option>
                                    <option value="India">India</option>
                                    <option value="Indonesia">Indonesia</option>
                                    <option value="Iran">Iran</option>
                                    <option value="Iraq">Iraq</option>
                                    <option value="Ireland">Ireland</option>
                                    <option value="Isle of Man">Isle of Man</option>
                                    <option value="Israel">Israel</option>
                                    <option value="Italy">Italy</option>
                                    <option value="Jamaica">Jamaica</option>
                                    <option value="Japan">Japan</option>
                                    <option value="Jordan">Jordan</option>
                                    <option value="Kazakhstan">Kazakhstan</option>
                                    <option value="Kenya">Kenya</option>
                                    <option value="Kiribati">Kiribati</option>
                                    <option value="Korea North">Korea North</option>
                                    <option value="Korea Sout">Korea South</option>
                                    <option value="Kuwait">Kuwait</option>
                                    <option value="Kyrgyzstan">Kyrgyzstan</option>
                                    <option value="Laos">Laos</option>
                                    <option value="Latvia">Latvia</option>
                                    <option value="Lebanon">Lebanon</option>
                                    <option value="Lesotho">Lesotho</option>
                                    <option value="Liberia">Liberia</option>
                                    <option value="Libya">Libya</option>
                                    <option value="Liechtenstein">Liechtenstein</option>
                                    <option value="Lithuania">Lithuania</option>
                                    <option value="Luxembourg">Luxembourg</option>
                                    <option value="Macau">Macau</option>
                                    <option value="Macedonia">Macedonia</option>
                                    <option value="Madagascar">Madagascar</option>
                                    <option value="Malaysia">Malaysia</option>
                                    <option value="Malawi">Malawi</option>
                                    <option value="Maldives">Maldives</option>
                                    <option value="Mali">Mali</option>
                                    <option value="Malta">Malta</option>
                                    <option value="Marshall Islands">Marshall Islands</option>
                                    <option value="Martinique">Martinique</option>
                                    <option value="Mauritania">Mauritania</option>
                                    <option value="Mauritius">Mauritius</option>
                                    <option value="Mayotte">Mayotte</option>
                                    <option value="Mexico">Mexico</option>
                                    <option value="Midway Islands">Midway Islands</option>
                                    <option value="Moldova">Moldova</option>
                                    <option value="Monaco">Monaco</option>
                                    <option value="Mongolia">Mongolia</option>
                                    <option value="Montserrat">Montserrat</option>
                                    <option value="Morocco">Morocco</option>
                                    <option value="Mozambique">Mozambique</option>
                                    <option value="Myanmar">Myanmar</option>
                                    <option value="Nambia">Nambia</option>
                                    <option value="Nauru">Nauru</option>
                                    <option value="Nepal">Nepal</option>
                                    <option value="Netherland Antilles">Netherland Antilles</option>
                                    <option value="Netherlands">Netherlands (Holland, Europe)</option>
                                    <option value="Nevis">Nevis</option>
                                    <option value="New Caledonia">New Caledonia</option>
                                    <option value="New Zealand">New Zealand</option>
                                    <option value="Nicaragua">Nicaragua</option>
                                    <option value="Niger">Niger</option>
                                    <option value="Nigeria">Nigeria</option>
                                    <option value="Niue">Niue</option>
                                    <option value="Norfolk Island">Norfolk Island</option>
                                    <option value="Norway">Norway</option>
                                    <option value="Oman">Oman</option>
                                    <option value="Pakistan">Pakistan</option>
                                    <option value="Palau Island">Palau Island</option>
                                    <option value="Palestine">Palestine</option>
                                    <option value="Panama">Panama</option>
                                    <option value="Papua New Guinea">Papua New Guinea</option>
                                    <option value="Paraguay">Paraguay</option>
                                    <option value="Peru">Peru</option>
                                    <option value="Phillipines">Philippines</option>
                                    <option value="Pitcairn Island">Pitcairn Island</option>
                                    <option value="Poland">Poland</option>
                                    <option value="Portugal">Portugal</option>
                                    <option value="Puerto Rico">Puerto Rico</option>
                                    <option value="Qatar">Qatar</option>
                                    <option value="Republic of Montenegro">Republic of Montenegro</option>
                                    <option value="Republic of Serbia">Republic of Serbia</option>
                                    <option value="Reunion">Reunion</option>
                                    <option value="Romania">Romania</option>
                                    <option value="Russia">Russia</option>
                                    <option value="Rwanda">Rwanda</option>
                                    <option value="St Barthelemy">St Barthelemy</option>
                                    <option value="St Eustatius">St Eustatius</option>
                                    <option value="St Helena">St Helena</option>
                                    <option value="St Kitts-Nevis">St Kitts-Nevis</option>
                                    <option value="St Lucia">St Lucia</option>
                                    <option value="St Maarten">St Maarten</option>
                                    <option value="St Pierre &amp; Miquelon">St Pierre &amp; Miquelon</option>
                                    <option value="St Vincent &amp; Grenadines">St Vincent &amp; Grenadines</option>
                                    <option value="Saipan">Saipan</option>
                                    <option value="Samoa">Samoa</option>
                                    <option value="Samoa American">Samoa American</option>
                                    <option value="San Marino">San Marino</option>
                                    <option value="Sao Tome &amp; Principe">Sao Tome &amp; Principe</option>
                                    <option value="Saudi Arabia">Saudi Arabia</option>
                                    <option value="Senegal">Senegal</option>
                                    <option value="Serbia">Serbia</option>
                                    <option value="Seychelles">Seychelles</option>
                                    <option value="Sierra Leone">Sierra Leone</option>
                                    <option value="Singapore">Singapore</option>
                                    <option value="Slovakia">Slovakia</option>
                                    <option value="Slovenia">Slovenia</option>
                                    <option value="Solomon Islands">Solomon Islands</option>
                                    <option value="Somalia">Somalia</option>
                                    <option value="South Africa">South Africa</option>
                                    <option value="Spain">Spain</option>
                                    <option value="Sri Lanka">Sri Lanka</option>
                                    <option value="Sudan">Sudan</option>
                                    <option value="Suriname">Suriname</option>
                                    <option value="Swaziland">Swaziland</option>
                                    <option value="Sweden">Sweden</option>
                                    <option value="Switzerland">Switzerland</option>
                                    <option value="Syria">Syria</option>
                                    <option value="Tahiti">Tahiti</option>
                                    <option value="Taiwan">Taiwan</option>
                                    <option value="Tajikistan">Tajikistan</option>
                                    <option value="Tanzania">Tanzania</option>
                                    <option value="Thailand">Thailand</option>
                                    <option value="Togo">Togo</option>
                                    <option value="Tokelau">Tokelau</option>
                                    <option value="Tonga">Tonga</option>
                                    <option value="Trinidad &amp; Tobago">Trinidad &amp; Tobago</option>
                                    <option value="Tunisia">Tunisia</option>
                                    <option value="Turkey">Turkey</option>
                                    <option value="Turkmenistan">Turkmenistan</option>
                                    <option value="Turks &amp; Caicos Is">Turks &amp; Caicos Is</option>
                                    <option value="Tuvalu">Tuvalu</option>
                                    <option value="Uganda">Uganda</option>
                                    <option value="Ukraine">Ukraine</option>
                                    <option value="United Arab Erimates">United Arab Emirates</option>
                                    <option value="United Kingdom">United Kingdom</option>
                                    <option value="United States of America">United States of America</option>
                                    <option value="Uraguay">Uruguay</option>
                                    <option value="Uzbekistan">Uzbekistan</option>
                                    <option value="Vanuatu">Vanuatu</option>
                                    <option value="Vatican City State">Vatican City State</option>
                                    <option value="Venezuela">Venezuela</option>
                                    <option value="Vietnam">Vietnam</option>
                                    <option value="Virgin Islands (Brit)">Virgin Islands (Brit)</option>
                                    <option value="Virgin Islands (USA)">Virgin Islands (USA)</option>
                                    <option value="Wake Island">Wake Island</option>
                                    <option value="Wallis &amp; Futana Is">Wallis &amp; Futana Is</option>
                                    <option value="Yemen">Yemen</option>
                                    <option value="Zaire">Zaire</option>
                                    <option value="Zambia">Zambia</option>
                                    <option value="Zimbabwe">Zimbabwe</option>
                                </select>
                            </form>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>State<label>*</label></span>
                            <FORM>
                                <SELECT NAME="state" id="state">
                                    <option value="">Select your state</option>
                                    <option value=”AG”>Agrigento</option>
                                    <option value=”AL”>Alessandria</option>
                                    <option value=”AN”>Ancona</option>
                                    <option value=”AO”>Aosta</option>
                                    <option value=”AR”>Arezzo</option>
                                    <option value=”AP”>Ascoli Piceno</option>
                                    <option value=”AT”>Asti</option>
                                    <option value=”AV”>Avellino</option>
                                    <option value=”BA”>Bari</option>
                                    <option value=”BT”>Barletta-Andria-Trani</option>
                                    <option value=”BL”>Belluno</option>
                                    <option value=”BN”>Benevento</option>
                                    <option value=”BG”>Bergamo</option>
                                    <option value=”BI”>Biella</option>
                                    <option value=”BO”>Bologna</option>
                                    <option value=”BZ”>Bolzano</option>
                                    <option value=”BS”>Brescia</option>
                                    <option value=”BR”>Brindisi</option>
                                    <option value=”CA”>Cagliari</option>
                                    <option value=”CL”>Caltanisetta</option>
                                    <option value=”CB”>Campobasso</option>
                                    <option value=”CI”>Carbonia-Iglesias</option>
                                    <option value=”CE”>Caserta</option>
                                    <option value=”CT”>Catania</option>
                                    <option value=”CZ”>Catanzaro</option>
                                    <option value=”CH”>Chieti</option>
                                    <option value=”CO”>Como</option>
                                    <option value=”CS”>Cosenza</option>
                                    <option value=”CR”>Cremona</option>
                                    <option value=”KR”>Crotone</option>
                                    <option value=”CN”>Cuneo</option>
                                    <option value=”EN”>Enna</option>
                                    <option value=”FM”>Fermo</option>
                                    <option value=”FE”>Ferrara</option>
                                    <option value=”FI”>Firenze</option>
                                    <option value=”FG”>Foggia</option>
                                    <option value=”FC”>Forlì-Cesena</option>
                                    <option value=”FR”>Frosinone</option>
                                    <option value=”GE”>Genova</option>
                                    <option value=”GO”>Gorizia</option>
                                    <option value=”GR”>Grosseto</option>
                                    <option value=”IM”>Imperia</option>
                                    <option value=”IS”>Isernia</option>
                                    <option value=”SP”>La Spezia</option>
                                    <option value=”AQ”>L’Aquila</option>
                                    <option value=”LT”>Latina</option>
                                    <option value=”LE”>Lecce</option>
                                    <option value=”LC”>Lecco</option>
                                    <option value=”LI”>Livorno</option>
                                    <option value=”LO”>Lodi</option>
                                    <option value=”LU”>Lucca</option>
                                    <option value=”MC”>Macerata</option>
                                    <option value=”MN”>Mantova</option>
                                    <option value=”MS”>Massa-Carrara</option>
                                    <option value=”MT”>Matera</option>
                                    <option value=”VS”>Medio Campidano</option>
                                    <option value=”ME”>Messina</option>
                                    <option value=”MI”>Milano</option>
                                    <option value=”MO”>Modena</option>
                                    <option value=”MB”>Monza e della Brianza</option>
                                    <option value=”NA”>Napoli</option>
                                    <option value=”NO”>Novara</option>
                                    <option value=”NU”>Nuoro</option>
                                    <option value=”OG”>Ogliastra</option>
                                    <option value=”OT”>Olbia-Tempio</option>
                                    <option value=”OR”>Oristano</option>
                                    <option value=”PD”>Padova</option>
                                    <option value=”PA”>Palermo</option>
                                    <option value=”PR”>Parma</option>
                                    <option value=”PV”>Pavia</option>
                                    <option value=”PG”>Perugia</option>
                                    <option value=”PU”>Pesaro e Urbino</option>
                                    <option value=”PE”>Pescara</option>
                                    <option value=”PC”>Piacenza</option>
                                    <option value=”PI”>Pisa</option>
                                    <option value=”PT”>Pistoia</option>
                                    <option value=”PN”>Pordenone</option>
                                    <option value=”PZ”>Potenza</option>
                                    <option value=”PO”>Prato</option>
                                    <option value=”RG”>Ragusa</option>
                                    <option value=”RA”>Ravenna</option>
                                    <option value=”RC”>Reggio Calabria</option>
                                    <option value=”RE”>Reggio nell'Emilia</option>
                                    <option value=”RI”>Rieti</option>
                                    <option value=”RN”>Rimini</option>
                                    <option value=”RM”>Roma</option>
                                    <option value=”RO”>Rovigo</option>
                                    <option value=”SA”>Salerno</option>
                                    <option value=”SS”>Sassari</option>
                                    <option value=”SV”>Savona</option>
                                    <option value=”SI”>Siena</option>
                                    <option value=”SR”>Siracusa</option>
                                    <option value=”SO”>Sondrio</option>
                                    <option value=”TA”>Taranto</option>
                                    <option value=”TE”>Teramo</option>
                                    <option value=”TR”>Terni</option>
                                    <option value=”TO”>Torino</option>
                                    <option value=”TP”>Trapani</option>
                                    <option value=”TN”>Trento</option>
                                    <option value=”TV”>Treviso</option>
                                    <option value=”TS”>Trieste</option>
                                    <option value=”UD”>Udine</option>
                                    <option value=”VA”>Varese</option>
                                    <option value=”VE”>Venezia</option>
                                    <option value=”VB”>Verbano-Cusio-Ossola</option>
                                    <option value=”VC”>Vercelli</option>
                                    <option value=”VR”>Verona</option>
                                    <option value=”VV”>Vibo Valentia</option>
                                    <option value=”VI”>Vicenza</option>
                                    <option value=”VT”>Viterbo</option>
                                </SELECT>
                            </FORM>
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>City<label>*</label></span>
                            <input type="text" name="city" id ="city">
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInRight" data-wow-delay="0.4s">
                            <span>Postal Code CAP<label>*</label></span>
                            <input type="tel" name="cap" id ="cap">
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <span>Telephone<label>*</label></span>
                            <input type="tel" name="telephone" id ="telephone">
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <span>Website<label></label></span>
                            <input type="text" name="website" id ="website">
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <span>Paypal Account<label>*</label></span>
                            <input type="email" name="paypal" id ="paypal">
                        </div>
                        <div style="visibility: hidden">
                            <span>Hidden div<label>*</label></span>
                            <input type="text">
                        </div>
                        <div class="wow fadeInLeft" data-wow-delay="0.4s">
                            <form>
                                <fieldset>
                                    <legend>Account type</legend>
                                    Customer <input type="radio" name="account_type" value="customer"/><br>
                                    Producer  <input type="radio" name="account_type" value="producer"/><br>
                                    Charity <input type="radio" name="account_type" value="charity"/>
                                </fieldset>
                            </form>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                </form>
                <div class="clearfix"> </div>
                <div class="register-but">
                    <form>
                        <input type="submit" value="submit">
                        <div class="clearfix"> </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    <!-- registration -->

    <div class="subscribe">
        <div class="container">
            <div class="subscribe1">
                <h4>the latest from swim wear</h4>
            </div>
            <div class="subscribe2">
                <form>
                    <input type="text" class="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
                    <input type="submit" value="JOIN">
                </form>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>

<!--footer-->
<div class="footer-section">
    <div class="container">
        <div class="footer-grids">
            <div class="col-md-2 footer-grid">
                <h4>company</h4>
                <ul>
                    <li><a href="products.jsp">products</a></li>
                    <li><a href="#">Work Here</a></li>
                    <li><a href="#">Team</a></li>
                    <li><a href="#">Happenings</a></li>
                    <li><a href="#">Dealer Locator</a></li>
                </ul>
            </div>
            <div class="col-md-2 footer-grid">
                <h4>service</h4>
                <ul>
                    <li><a href="#">Support</a></li>
                    <li><a href="#">FAQ</a></li>
                    <li><a href="#">Warranty</a></li>
                    <li><a href="contact.html">Contact Us</a></li>
                </ul>
            </div>
            <div class="col-md-2 footer-grid">
                <h4>order & returns</h4>
                <ul>
                    <li><a href="#">Order Status</a></li>
                    <li><a href="#">Shipping Policy</a></li>
                    <li><a href="#">Return Policy</a></li>
                    <li><a href="#">Digital Gift Card</a></li>
                </ul>
            </div>
            <div class="col-md-2 footer-grid">
                <h4>legal</h4>
                <ul>
                    <li><a href="#">Privacy</a></li>
                    <li><a href="#">Terms and Conditions</a></li>
                    <li><a href="#">Social Responsibility</a></li>
                </ul>
            </div>
            <div class="col-md-4 footer-grid1">
                <div class="social-icons">
                    <a href="#"><i class="icon"></i></a>
                    <a href="#"><i class="icon1"></i></a>
                    <a href="#"><i class="icon2"></i></a>
                    <a href="#"><i class="icon3"></i></a>
                    <a href="#"><i class="icon4"></i></a>
                </div>
                <p>Copyright &copy; 2015 Swim Wear. All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
            </div>
            <div class="clearfix"></div>
        </div>
    </div>
</div>
<!--footer-->

</body>
</html>
