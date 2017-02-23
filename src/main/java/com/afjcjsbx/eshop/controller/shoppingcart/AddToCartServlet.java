package com.afjcjsbx.eshop.controller.shoppingcart;

import com.afjcjsbx.eshop.controller.search.FilteredSearchController;
import com.afjcjsbx.eshop.entity.catalogue.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;

/**
 * Created by afjcjsbx on 03/02/17.
 */
public class AddToCartServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        String product_id = request.getParameter("productid");

        FilteredSearchController sc = new FilteredSearchController();

        Product p = null;
        try {
            p = sc.searchProductByID(product_id);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ShoppingCartController scc = new ShoppingCartController();

/*        if (scc.addProduct(request, p)) {
            response.sendRedirect("checkout_old.jsp"); //error page
        }else{
            response.sendRedirect("single.jsp?pid=" + product_id + "&option=alreadyInCart"); //error page
        }*/

    }


}
