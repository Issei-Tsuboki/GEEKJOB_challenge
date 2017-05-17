<%-- 
    Document   : JavaChallenge0501
    Created on : 2017/05/17, 17:16:13
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
            int num = 2;
            
            if(num == 1){
                out.print("１です！");
            }else if(num == 2){
                out.print("プログラミングキャンプ！");
            }else{
                out.print("その他です！");
            }
        %>
    </body>
</html>
