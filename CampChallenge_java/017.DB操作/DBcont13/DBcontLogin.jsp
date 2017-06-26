<%-- 
    Document   : DBcontLogin
    Created on : 2017/06/16, 14:22:25
    Author     : issei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession login = request.getSession();
    login.invalidate();
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="./DBcontLogin" method="post">
             <center>
                 <h2>ユーザーログイン</h2>
                 <hr width="20%">
                 <p>ID<input type="text" name="id" size="10"></p>
                 <p>Pass<input type="password" name="pass" size="10"></p>
                 
                 <input type="submit" name="btnSubmit" value="ログイン"><br>
             </center>
            <Div Align="right"><input type="button" value="新規ユーザ登録" onclick="location.href='./DBcontMaster.jsp'"></div>
         </form>
    </body>
</html>
