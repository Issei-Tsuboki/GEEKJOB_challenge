<%-- 
    Document   : JavaChallenge0701
    Created on : 2017/05/18, 13:16:06
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
            
            out.println(date[0]);
            out.println(date[1]);
            out.println(date[2]);
            out.println(date[3]);
            out.println(date[4]);
            out.println(date[5]);
            out.println(date[6]);
            
        %>
    </body>
</html>
