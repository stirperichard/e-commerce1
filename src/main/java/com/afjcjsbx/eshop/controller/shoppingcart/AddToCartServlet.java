package com.afjcjsbx.eshop.controller.shoppingcart;

import com.afjcjsbx.eshop.controller.search.SearchController;
import com.afjcjsbx.eshop.entity.catalog.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by afjcjsbx on 03/02/17.
 */
public class AddToCartServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {


        String product_id = request.getParameter("productid");


        SearchController sc = new SearchController();

        Product p = sc.searchProductByID(product_id);

        ShoppingCartController scc = new ShoppingCartController();
        scc.addProduct(request, p);

        response.sendRedirect("checkout.jsp"); //error page

    }




}
