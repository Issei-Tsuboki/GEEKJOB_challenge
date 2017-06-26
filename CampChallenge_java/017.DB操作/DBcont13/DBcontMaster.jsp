<%-- 
    Document   : DBcontMaster
    Created on : 2017/06/16, 14:40:53
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
        <form action="./DBcontMaster" method="post">
             <center>
                 <h2>管理者ログイン</h2>
                 <hr width="20%">
                 <p>Pass<input type="password" name="pass" size="20"></p>
                 
                 <input type="submit" name="btnSubmit" value="ログイン"><br>
             </center>
         </form>
    </body>
</html>
