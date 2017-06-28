<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper" %>
<%
    HttpSession hs = request.getSession();
    UserDataBeans udb = (UserDataBeans)hs.getAttribute("udb");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
        <% if(!udb.getName().equals("") && !udb.getYear().equals("null") && !udb.getMonth().equals("null")
                && !udb.getDay().equals("null")&& !udb.getTell().equals("")&& !udb.getComment().equals("")){ %>
        <h1>登録確認</h1>
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= udb.getType()%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
            <input type="submit" name="yes" value="はい">
        </form>
    <% }else{ %>
        <h1>以下の入力が不完全です</h1>
        <h2>
        <%
            if(udb.getName().equals("")){
                out.print("名前<br>");
            }
            if(udb.getYear().equals("")){
                out.print("年<br>");
            }
            if(udb.getMonth().equals("")){
                out.print("月<br>");
            }
            if(udb.getDay().equals("")){
                out.print("日<br>");
            }
            if(udb.getTell().equals("")){
                out.print("電話番号<br>");
            }
            if(udb.getComment().equals("")){
                out.print("自己紹介<br>");
            }
        %>
        </h2>
    <% } %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <br>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
