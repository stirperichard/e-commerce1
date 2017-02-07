package com.afjcjsbx.eshop.controller.advertisement;

import com.afjcjsbx.eshop.controller.login.LoginController;
import com.afjcjsbx.eshop.entity.login.AbstractUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchServlet
 */
public class AdvertisementServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try {

            String username = request.getParameter("username");
            String password = request.getParameter("password");

            AbstractUser user = LoginController.login(username, password);

            if (user != null) {
                if (user.isValid()) {

                    HttpSession session = request.getSession(true);
                    session.setAttribute("currentSessionUser", user);
                    response.sendRedirect("index.jsp"); //logged-in page

                } else {
                    response.sendRedirect("invalid_login.jsp"); //error page
                }
            }

        } catch (Throwable theException) {

            System.out.println(theException.toString());
        }
    }
}
