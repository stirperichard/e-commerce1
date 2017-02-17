<%@ page import="com.afjcjsbx.eshop.controller.registration.RegistrationController" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Consumer" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Producer" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Charity" %><%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 17/02/2017
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 19/01/2017
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 18/01/2017
  Time: 11:55
  To change this template use File | Settings | File Templates.
--%>
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


    if ((mail == confirm_mail) && (password == confirm_password)) {

        RegistrationController controller = new RegistrationController();

        if ((type.equals("Consumer"))) {
            Consumer consumer = new Consumer();
            consumer.setName(name);
            consumer.setSurname(surname);
            consumer.setEmail(mail);
            consumer.setUsername(username);
            consumer.setPassword(password);
            consumer.setAddress1(address);
            consumer.setAddress2(address2);
            consumer.setCountry(country);
            consumer.setState(state);
            consumer.setCity(city);
            consumer.setZip_code(cap);
            consumer.setPhone(telephone);
            consumer.setPayPalAccount(paypal);
            consumer.setWebsite(website);
            session.setAttribute("currentSessionUser", consumer);

            if (controller.register_consumer(consumer)) {
                response.sendRedirect("userRegistered.jsp");
            } else {
                response.sendRedirect("InvalidRegistration.jsp");
            }
        } else if (type.equals("Producer")) {
            Producer producer = new Producer();
            producer.setName(name);
            producer.setSurname(surname);
            producer.setEmail(mail);
            producer.setUsername(username);
            producer.setPassword(password);
            producer.setAddress1(address);
            producer.setAddress2(address2);
            producer.setCountry(country);
            producer.setState(state);
            producer.setCity(city);
            producer.setZip_code(cap);
            producer.setPhone(telephone);
            producer.setPayPalAccount(paypal);
            producer.setWebsite(website);
            session.setAttribute("currentSessionUser", producer);

            if (controller.register_producer(producer)) {
                response.sendRedirect("userRegistered.jsp");
            } else {
                response.sendRedirect("InvalidRegistration.jsp");
            }
        } else if(type.equals("Charity")) {
            Charity charity = new Charity();
            charity.setName(name);
            charity.setSurname(surname);
            charity.setEmail(mail);
            charity.setUsername(username);
            charity.setPassword(password);
            charity.setAddress1(address);
            charity.setAddress2(address2);
            charity.setCountry(country);
            charity.setState(state);
            charity.setCity(city);
            charity.setZip_code(cap);
            charity.setPhone(telephone);
            charity.setPayPalAccount(paypal);
            charity.setWebsite(website);
            session.setAttribute("currentSessionUser", charity);
        }
    }
%>


