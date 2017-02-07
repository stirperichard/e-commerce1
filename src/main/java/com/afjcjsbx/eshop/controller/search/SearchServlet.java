package com.afjcjsbx.eshop.controller.search;

import com.afjcjsbx.eshop.dao.search.SearchDAO;
import com.afjcjsbx.eshop.entity.catalog.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try {

            String search = request.getParameter("search");

            if (!search.isEmpty()) {

                SearchDAO searchDAO = new SearchDAO();
                List<Product> productlist = searchDAO.search(search);

                System.out.println(productlist.size() +  " lungheezzaaa");

                request.setAttribute("productlist", productlist);
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/products.jsp");
                dispatcher.forward(request, response);

            } else {
                response.sendRedirect("categories.jsp"); //error page
            }

        } catch (Throwable theException) {

            System.out.println(theException.toString());
        }
    }
}
