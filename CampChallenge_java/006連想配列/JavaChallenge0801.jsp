<%-- 
    Document   : JavaChallenge0801
    Created on : 2017/05/18, 13:55:43
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
        <%@ page import="java.util.HashMap" %>
        <%
            HashMap<String,String> date = new HashMap <String,String>();
            
            date.put("1","AAA");
            date.put("hello","world");
            date.put("soeda","33");
            date.put("20","20");
            
            out.println(date.get("1"));
            out.println(date.get("hello"));
            out.println(date.get("soeda"));
            out.println(date.get("20"));
            
        %>
    </body>
</html>
