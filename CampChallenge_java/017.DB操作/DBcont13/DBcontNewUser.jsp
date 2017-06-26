<%-- 
    Document   : DBcontNewUser
    Created on : 2017/06/16, 14:41:22
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
        <form action="./DBcontNewUser" method="post">
             <center>
                 <h2>新規ユーザー登録</h2>
                 <hr width="20%">
                 
                 <p>名前<input type="text" name="name" size="10"></p>
                 <p>ID<input type="text" name="id" size="10"></p>
                 <p>Pass<input type="text" name="pass" size="10"></p>
                 
                 <input type="submit" name="btnSubmit" value="登録"><br>
             </center>
            
         </form>
    </body>
</html>
