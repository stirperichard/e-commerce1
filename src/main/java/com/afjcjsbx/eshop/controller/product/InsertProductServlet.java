package com.afjcjsbx.eshop.controller.product;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by afjcjsbx on 09/02/17.
 */
public class InsertProductServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {

        String loginFormEmail = request.getParameter("product_name");
        System.out.println("product_name:" + loginFormEmail);
        // do something to produce a response
    }


}
