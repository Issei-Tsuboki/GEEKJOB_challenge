<%-- 
    Document   : FortuneTellingResult
    Created on : 2017/05/19, 15:30:05
    Author     : issei
--%>
<%@page import="org.camp.servlet.ResultData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
        ResultData data = (ResultData)request.getAttribute("DATA");
        %>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if(data != null){
                out.print("<h1>あなたの"+data.getD()+"の運勢は、"+data.getLuck()+"です！</1h>");
            }
        %>
    </body>
</html>
