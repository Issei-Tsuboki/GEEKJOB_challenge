<%-- 
    Document   : JavaChallenge0602
    Created on : 2017/05/18, 10:12:16
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
            //'a'
            //シングルコーテーションは一文字
            //char型
            //"aiueo"
            //ダブルコーテーションは複数文字
            //Stringクラス
            
            char x ='あ';
            
            switch(x){
                case 'A':
                    out.print("英語");
                    break;
                case 'あ':
                    out.print("日本語");
                    break;
            }
   
        %>
    </body>
</html>
