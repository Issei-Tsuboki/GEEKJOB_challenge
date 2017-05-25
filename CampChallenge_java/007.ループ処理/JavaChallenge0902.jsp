<%-- 
    Document   : JavaChallenge0902
    Created on : 2017/05/18, 14:50:35
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
            String moji ="";
            
            for(int i=0;i<30;i++){
                moji += "A";
            }
            
            out.print(moji);
            
        %>
    </body>
</html>
