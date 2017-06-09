<%-- 
    Document   : QueSt02
    Created on : 2017/06/07, 16:49:41
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
            request.setCharacterEncoding("UTF-8");
            int num  = Integer.parseInt(request.getParameter("num"));
            
            out.print("数値　"+ num + "<br>素数　");
            
            while(num > 1){
                if(num%2 == 0){
                    out.print("2,");
                    num /= 2;
                }else if(num%3 == 0){
                    out.print("3,");
                    num /= 3;
                }else if(num%5 == 0){
                    out.print("5,");
                    num /= 5;
                }else if(num%7 == 0){
                    out.print("7,");
                    num /= 7;
                }else{
                    num -= 1;
                    
                    while(num > 1){
                        out.print("2,");
                        num /= 2;
                    }
                    out.print("　余り　1");
                }
            }
        %>
    </body>
</html>
