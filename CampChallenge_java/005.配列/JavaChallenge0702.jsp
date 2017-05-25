<%-- 
    Document   : JavaChallenge0702
    Created on : 2017/05/18, 13:32:17
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
            String[] date ={"10", "100", "soeda", "hayashi", "-20", "118", "END"};
            
            out.println(date[2]);
            
            date[2] = "33";
            
            out.println(date[2]);

        %>
    </body>
</html>
