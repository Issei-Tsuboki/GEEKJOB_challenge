<%-- 
    Document   : QueSt
    Created on : 2017/06/07, 15:25:51
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
        //int i = Integer.parseInt(s);
        int type  = Integer.parseInt(request.getParameter("type"));
        int total = Integer.parseInt(request.getParameter("total"));
        int count = Integer.parseInt(request.getParameter("count"));
        
        switch(type){
            case 1:
                out.print("雑貨<br>");
                break;
            case 2:
                out.print("生鮮食品<br>");
                break;
            case 3:
                out.print("その他<br>");
                break;
        }
        out.print("1つ当たり　" + total/count + "円<br>");
        
        if(3000<=total && total<5000){
            out.print("付与ポイント　" + total/100*4 + "pt<br>");
        }else if(5000 <= total){
            out.print("付与ポイント　" + total/100*5 + "pt<br>");
        }

        %>
    </body>
</html>
