<%@ page import="com.afjcjsbx.eshop.enums.shipment.DeliveryStatus" %>
<%@ page import="com.afjcjsbx.eshop.entity.shipment.Shipment" %>
<%@ page import="com.afjcjsbx.eshop.controller.shipment.ShipmentController" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Richard
  Date: 17/02/2017
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%--
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String string_date = request.getParameter("date");
    String tracking = request.getParameter("tracking");
    DeliveryStatus s_type = null;
    String label = "";

    Shipment shipment = new Shipment();
    date = (Date) string_date;
    shipment.setDate(date);
    shipment.setTrackingNumber(tracking);

    ShipmentController controller = new ShipmentController();
    s_type = controller.shipment(shipment);

    if (s_type != null){
        if(s_type == DeliveryStatus.NOT_FOUND){
            label = "Username o ShipID non validi";
        } else if (s_type == DeliveryStatus.NOTSENT){
            label = "Da spedire";
        } else if (s_type == DeliveryStatus.SENT){
            label = "Spedito";
        } else if (s_type == DeliveryStatus.DELIVERED){
            label = "Consegnato";
        }
    }
    System.out.println(s_type);
%>
--%>