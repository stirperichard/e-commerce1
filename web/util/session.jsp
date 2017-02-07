<%--
  Created by IntelliJ IDEA.
  User: afjcjsbx
  Date: 04/01/17
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" %>
<%@ page import="com.afjcjsbx.eshop.entity.login.Guest" %>
<%@ page import="static com.afjcjsbx.eshop.enums.Roles.GUEST" %>
<%
    // Get session creation time.
    Date createTime = new Date(session.getCreationTime());
    // Get last access time of this web page.
    Date lastAccessTime = new Date(session.getLastAccessedTime());

    int visitCount = 0;
    session.setAttribute("visitCountKey",  visitCount);

    // Check if this is new comer on your web page.
    if (session.isNew()){
        Guest user = new Guest("aaaa", "bbbb", "ppppp", GUEST);
        user.loadUser();

        session.setAttribute("user", user);
        session.setAttribute("visitCountKey",  visitCount);
    }

    visitCount = (int) session.getAttribute("visitCountKey");
    visitCount = visitCount + 1;
    session.setAttribute("visitCountKey",  visitCount);


%>