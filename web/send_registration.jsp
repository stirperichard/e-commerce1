<%@ page import="com.afjcjsbx.eshop.controller.registration.RegistrationController" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Consumer" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Producer" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Charity" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.AbstractUser" %>
<%@ page import="com.afjcjsbx.eshop.enums.Roles" %>

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

    if ((mail.equals(confirm_mail)) && (password.equals(confirm_password))) {

        RegistrationController controller = new RegistrationController();

        if(type.equals("Consumer")){

            Consumer user = new Consumer();
            user.setName(name);
            user.setSurname(surname);
            user.setEmail(mail);
            user.setUsername(username);
            user.setPassword(password);
            user.setAddress1(address);
            user.setAddress2(address2);
            user.setCountry(country);
            user.setState(state);
            user.setCity(city);
            user.setZip_code(cap);
            user.setPhone(telephone);
            user.setPayPalAccount(paypal);
            user.setWebsite(website);
            user.setType(Roles.CONSUMER);

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

            Producer user = new Producer();
            user.setName(name);
            user.setSurname(surname);
            user.setEmail(mail);
            user.setUsername(username);
            user.setPassword(password);
            user.setAddress1(address);
            user.setAddress2(address2);
            user.setCountry(country);
            user.setState(state);
            user.setCity(city);
            user.setZip_code(cap);
            user.setPhone(telephone);
            user.setPayPalAccount(paypal);
            user.setWebsite(website);
            user.setType(Roles.PRODUCER);

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

            Charity user = new Charity();
            user.setName(name);
            user.setSurname(surname);
            user.setEmail(mail);
            user.setUsername(username);
            user.setPassword(password);
            user.setAddress1(address);
            user.setAddress2(address2);
            user.setCountry(country);
            user.setState(state);
            user.setCity(city);
            user.setZip_code(cap);
            user.setPhone(telephone);
            user.setPayPalAccount(paypal);
            user.setWebsite(website);
            user.setType(Roles.CHARITY);

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


