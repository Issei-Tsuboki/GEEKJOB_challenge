<%-- 
    Document   : JavaChallenge0301
    Created on : 2017/05/17, 15:33:29
    Author     : issei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            final int base = 50;
            int num = 5;
            
            out.println(base + num);
            out.println(base - num);
            out.println(base * num);
            out.println(base / num);
            
        %>
    </body>
</html>
