<%-- 
    Document   : DBcontMain
    Created on : 2017/06/16, 14:23:59
    Author     : issei
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DBzaiko.DBcontrol" %>
<%
    HttpSession login = request.getSession();
    if(login.getAttribute("login").equals(null)){
        response.sendRedirect("./DBcontLogin.jsp");
    }
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <Div Align="right"><input type="button" value="ログアウト" onclick="location.href='./DBcontLogin.jsp'"></div>
             <center>
                 <h2>在庫管理</h2>
                 <hr width="90%">
             </center>
                 <Div Align="left"><input type="button" value="商品登録" onclick="location.href='./DBcontRegister.jsp'"></div>
                
             <center>
                 <!--<form action="./DBcontMain.jsp" method="post">
                 商品名<input type="text" name="name" size="20">
                 商品種別<input type="radio" name="type" value="食品" >食品
                        <input type="radio" name="type" value="雑貨">雑貨
                        <input type="radio" name="type" value="その他">その他
                
                 <input type="submit" name="btnSubmit" value="検索"><br>
         </form>-->
             
             <table border="1" width="60%">
                 <tr bgcolor="#A9D0F5">
                     <td>商品名</td><td>商品種別</td><td>在庫数</td>
                 </tr>
                     
        <%
            DBcontrol cont = new DBcontrol();
            
            cont.open();
            
            String name = request.getParameter("name");
            String type = request.getParameter("type");
            
            ResultSet db_data;
            
            if(name!=null && type!=null){
                db_data = cont.search("select * from zaikoShouhin where name like '%"+name+"%' type='"+type+"'");
            }else if(name != null){
                db_data = cont.search("select * from zaikoShouhin where name like %"+name+"%");
            }else if(type != null){
                db_data = cont.search("select * from zaikoShouhin where type='"+type+"'");
            }else{
                db_data = cont.itiran();
            }    
            while(db_data.next()){  
                out.print("<tr>");
                out.print("<td>" + db_data.getString("name") + "</td>");
                out.print("<td>" + db_data.getString("type") + "</td>");
                out.print("<td>" + db_data.getString("stock") + "</td>");
                out.print("</tr>");
            }
        %>
             </table>  
             </center>
    </body>
</html>
