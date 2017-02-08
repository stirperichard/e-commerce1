package com.afjcjsbx.eshop.controller.login;

import com.afjcjsbx.eshop.entity.login.AbstractUser;
import com.afjcjsbx.eshop.entity.login.Guest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchServlet
 */
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        try {

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            AbstractUser user = LoginController.retrieveUserInfoByEmailAndPassword(email, password);

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
