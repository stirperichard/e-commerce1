<%@ page import="com.afjcjsbx.eshop.controller.registration.RegistrationController" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Consumer" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Producer" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Charity" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.AbstractUser" %>
<%@ page import="com.afjcjsbx.eshop.enums.Roles" %>
<%@ page import="java.sql.SQLException" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" session="true"%>

<%
    String name = request.getParameter("name");
    String surname = request.getParameter("surname");
    String mail = request.getParameter("mail");
    String confirm_mail = request.getParameter("confirm_mail");
    String password = request.getParameter("password") ;
    String confirm_password = request.getParameter("confirm_password") ;
    String username = request.getParameter("username");
    String address = request.getParameter("address");
    String address2 = request.getParameter("address2");
    String country = request.getParameter("country");
    String state = request.getParameter("state");
    String city = request.getParameter("city");
    String cap = request.getParameter("cap");
    String telephone = request.getParameter("telephone");
    String website = request.getParameter("website");
    String paypal = request.getParameter("paypal");
    String type = request.getParameter("type");

    RegistrationController controller = new RegistrationController();
    AbstractUser user = null;

    if ((mail.equals(confirm_mail)) && (password.equals(confirm_password))) {

        if(type.equals("Consumer")){

            try {
                user = controller.create_user(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal, Roles.CONSUMER);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            session.setAttribute("currentSessionUser", user);

            if (controller.FindByEmail(mail) && controller.FindByUsername(username)) {
                if(controller.register_user(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal, Roles.CONSUMER)){
                    response.sendRedirect("userRegistered.jsp");
                } else {
                    response.sendRedirect("InvalidRegistration.jsp");
                }
            } else {
                response.sendRedirect("InvalidRegistration.jsp");
            }

        } else if(type.equals("Producer")){


            try {
                user = controller.create_user(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal, Roles.PRODUCER);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            session.setAttribute("currentSessionUser", user);

            if (controller.FindByEmail(mail) && controller.FindByUsername(username)) {
                if(controller.register_user(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal, Roles.PRODUCER)){
                    response.sendRedirect("userRegistered.jsp");
                } else {
                    response.sendRedirect("InvalidRegistration.jsp");
                }
            } else {
                response.sendRedirect("InvalidRegistration.jsp");
            }

        }else if(type.equals("Charity")){

            try {
                user = controller.create_user(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal, Roles.CHARITY);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            session.setAttribute("currentSessionUser", user);

            if (controller.FindByEmail(mail) && controller.FindByUsername(username)) {
                if(controller.register_user(username, mail, password, name, surname, address, address2, city, state, cap, country, telephone, website, paypal, Roles.CHARITY)){
                    response.sendRedirect("userRegistered.jsp");
                } else {
                    response.sendRedirect("InvalidRegistration.jsp");
                }
            } else {
                response.sendRedirect("InvalidRegistration.jsp");
            }
        }
    } else {
        System.out.println("Mail o Password diversi");
    }
%>


