<%@ page import="com.afjcjsbx.eshop.controller.shoppingcart.ShoppingCartController" %>
<%@ page import="com.afjcjsbx.eshop.entity.catalogue.Product" %><%--
  Created by IntelliJ IDEA.
  Guest: afjcjsbx
  Date: 03/02/17
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%

    ShoppingCartController shoppingCartController = new ShoppingCartController();

    Product p = null;

    if (request.getParameter("product") == null) {
        out.println("Error in product");
    } else {
        //p = (Product) request.getParameter("product");

    }

%>
