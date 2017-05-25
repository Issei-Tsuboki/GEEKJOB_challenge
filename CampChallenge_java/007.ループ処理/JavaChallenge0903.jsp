<%-- 
    Document   : JavaChallenge0903
    Created on : 2017/05/18, 16:42:42
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
            int total = 0;
            
            for(int i=1;i<=100;i++){
              total += i;
              }
            
            out.print(total);
        %>
    </body>
</html>
