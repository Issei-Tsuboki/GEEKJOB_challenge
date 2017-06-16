/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBcontrol;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author issei
 */
@WebServlet(name = "DBcont09", urlPatterns = {"/DBcont09"})
public class DBcont09 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        Connection db_con       = null;
        PreparedStatement db_st = null;
        ResultSet db_data       = null;
        
        try (PrintWriter out = response.getWriter()) {
            request.setCharacterEncoding("UTF-8");
            
            int    id        = Integer.parseInt(request.getParameter("id"));
            String name      = request.getParameter("name");
            String tell      = request.getParameter("tell");
            int    age       = Integer.parseInt(request.getParameter("age"));
            String birthday  = request.getParameter("birthday");
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db","Issei","myNameIsTsuboki");
            
            db_st = db_con.prepareStatement("insert into profiles values (?,?,?,?,?)");
            db_st.setInt(1, id);
            db_st.setString(2, name);
            db_st.setString(3, tell);
            db_st.setInt(4, age);
            db_st.setString(5, birthday);
            
            db_st.executeUpdate();
            
            db_st = db_con.prepareStatement("select * from profiles");
            
            db_data = db_st.executeQuery();
            
            int i  = 0;
            int j  = 1;
            while(db_data.next()){
                if(i < db_data.getInt("profilesID")){
                    i = db_data.getInt("profilesID");
                }
            }
            db_data.beforeFirst();
            
            while(j <= i){
                while(db_data.next()){
                    if(j == db_data.getInt("profilesID")){
                        out.println(db_data.getString("profilesID"));
                        out.println(db_data.getString("name"));
                        out.println(db_data.getString("tell"));
                        out.println(db_data.getString("age"));
                        out.println(db_data.getString("birthday") + "<br>");
                    }
                }
                j++;
                db_data.beforeFirst();
            }
            
            db_data.close();
            db_st.close();
            db_con.close();
            
            
        } catch(SQLException ex){
            System.out.print("接続時にエラーが発生しました：" + ex.toString());
        } catch (ClassNotFoundException ex) {
            System.out.print("接続時にエラーが発生しました：" + ex.toString());
        } catch (InstantiationException ex) {
            System.out.print("接続時にエラーが発生しました：" + ex.toString());
        } catch (IllegalAccessException ex) {
            System.out.print("接続時にエラーが発生しました：" + ex.toString());
        } finally{
            if(db_con != null){
                try{
                    db_con.close();
                } catch(SQLException ex){
                    System.out.print("Error" + ex.getMessage());
                }
            }  
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
