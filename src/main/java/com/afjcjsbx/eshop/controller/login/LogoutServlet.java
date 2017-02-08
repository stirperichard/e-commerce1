package com.afjcjsbx.eshop.controller.login;

import com.afjcjsbx.eshop.entity.login.AbstractUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SearchServlet
 */
public class LogoutServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {


        HttpSession session = request.getSession(true);
        session.setAttribute("currentSessionUser", null);
        response.sendRedirect("index.jsp"); //logged-in page


    }
}
