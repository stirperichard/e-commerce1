package com.afjcjsbx.eshop.controller.registration;

import com.afjcjsbx.eshop.entity.login.AbstractUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Richard on 13/02/2017.
 */
public class RegistrationServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {
        try{
            String mail = request.getParameter("mail");
            String password = request.getParameter("password");
            String username = request.getParameter("username");
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
            String address = request.getParameter("address");
            String address2 = request.getParameter("address2");
            String country = request.getParameter("country");
            String state = request.getParameter("state");
            String city = request.getParameter("city");
            String cap = request.getParameter("cap");
            String telephone = request.getParameter("telephone");
            String website = request.getParameter("website");
            String paypal = request.getParameter("paypal");

            AbstractUser user = RegistrationController.retrieveUserInfoByEmail(mail);
            AbstractUser user1 = RegistrationController.retrieveUserInfoByUsername(username);

            if (user == null && user1 == null) {

            }

        }catch (Throwable theException) {
            System.out.println(theException.toString());
        }
    }
}