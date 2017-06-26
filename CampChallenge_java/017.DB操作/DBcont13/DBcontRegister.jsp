<%-- 
    Document   : DBcontRegistr
    Created on : 2017/06/16, 14:38:45
    Author     : issei
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品登録</title>
    </head>
    <body>
        <form action="./DBcontRegister" method="post">
             <center>
                 <h2>商品登録フォーム</h2>
                 <hr width="20%">
                 <p>商品名<input type="text" name="name" size="20"><br></p>
                 <p>商品種別<br><br>
                     <input type="radio" name="type" value="食品" >食品
                     <input type="radio" name="type" value="雑貨">雑貨
                     <input type="radio" name="type" value="その他">その他<br>
                 </p>
                 <p>在庫数<input type="text" name="stock" size="10"></p>
                 
                 <input type="submit" name="btnSubmit" value="登録"><br>
             </center>
         </form>
    </body>
</html>
