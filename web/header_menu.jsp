<%@ page import="com.afjcjsbx.eshop.controller.shoppingcart.ShoppingCartController" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Guest" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Producer" %>
<%@ page import="com.afjcjsbx.eshop.enums.Roles" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.AbstractUser" %>
<%--
  Created by IntelliJ IDEA.
  Guest: afjcjsbx
  Date: 11/01/17
  Time: 00:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ShoppingCartController shoppingCartController = new ShoppingCartController();

    AbstractUser u;

    if (session.getAttribute("currentSessionUser") != null) {
        u = (AbstractUser) session.getAttribute("currentSessionUser");
    }else{
        u = new Guest();
    }
%>


<!--header-->
<div class="header">


    <div class="header-top">
        <div class="container">


            <div class="lang_list">
                <select tabindex="4" class="dropdown1">
                    <option value="English" class="label" value="">English</option>
                </select>
            </div>

            <div class="top-right">


                <ul>


                    <li class="text">

                        <% if (u.getType() == Roles.GUEST) { %>
                        <a href="login.jsp">login</a>
                        <% } else { %>

                        <div class="dropdown">
                            <button class="dropbtn"><%= u.getUsername().toUpperCase() %></button>

                            <div class="dropdown-content">
                                <% if (u.getType() == Roles.PRODUCER) { %>
                                <a href="insert_advertise.jsp">Sell a product</a>
                                <% } %>
                                <a href="user_profile.jsp">Profile</a>
                                <a href="logout">Logout</a>

                            </div>
                        </div>
                        <% } %>

                    </li>
                    <li>
                        <div class="cart box_1">
                            <a href="checkout.jsp">
                                <span class="simpleCart_total"> <% out.print(shoppingCartController.getCartPrice(request)); %> </span>
                                (<span id="simpleCart_quantity"
                                       class="simpleCart_quantity"><% out.print(shoppingCartController.productCount(request)); %></span>)
                            </a>
                            <p><a href="javascript:;" class="simpleCart_empty">Empty cart</a></p>
                            <div class="clearfix"></div>
                        </div>
                    </li>
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
                        <button type="button" class="navbar-toggle" data-toggle="collapse"
                                data-target="#bs-example-navbar-collapse-1">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <h1 class="navbar-brand"><a href="index.jsp">Eshop</a></h1>
                    </div>
                    <!--/.navbar-header-->

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <ul class="nav navbar-nav">
                            <li><a href="index.jsp">Home</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">Elettronica <b
                                        class="caret"></b></a>
                                <ul class="dropdown-menu multi-column columns-3">
                                    <div class="row">
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="products.jsp">Main categories</a></li>
                                                <li><a class="list1" href="products.jsp">Smartphones</a></li>
                                                <li><a class="list1" href="products.jsp">Informatics</a></li>
                                                <li><a class="list1" href="products.jsp">Tv & entertainment</a></li>
                                            </ul>
                                        </div>
                                        <div class="col-sm-4">
                                            <ul class="multi-column-dropdown">
                                                <li><a class="list" href="products.jsp">Other categories</a></li>
                                                <li><a class="list1" href="products.jsp">River Island</a></li>
                                                <li><a class="list1" href="products.jsp">Penny</a></li>
                                                <li><a class="list1" href="products.jsp">Nidhi Munim</a></li>
                                                <li><a class="list1" href="products.jsp">Divaat</a></li>
                                            </ul>
                                        </div>
                                    </div>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">women <b
                                        class="caret"></b></a>
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
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">kids <b
                                        class="caret"></b></a>
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
                        <input class="sb-search-input" placeholder="Enter your search term..." type="search"
                               name="search" id="search">
                        <input class="sb-search-submit" type="submit" value="">
                        <span class="sb-icon-search"> </span>
                    </form>
                </div>
            </div>

            <!-- search-scripts -->
            <script src="js/classie.js"></script>
            <script src="js/uisearch.js"></script>
            <script>
                new UISearch(document.getElementById('sb-search'));
            </script>
            <!-- //search-scripts -->
            <div class="clearfix"></div>
        </div>
    </div>
</div>

