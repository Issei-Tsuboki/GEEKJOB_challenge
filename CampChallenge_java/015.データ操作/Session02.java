/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cookie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author issei
 */
@WebServlet(name = "Session02", urlPatterns = {"/Session02"})
public class Session02 extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            
            request.setCharacterEncoding("UTF-8");
            HttpSession hs = request.getSession();
            
            String name = request.getParameter("txtName");
            String hobby = request.getParameter("mulText"); 
            String sex = request.getParameter("rdoSample");
            
            hs.setAttribute("name", name);
            hs.setAttribute("hobby", hobby);
            hs.setAttribute("sex", sex);
            
            Object hsn = hs.getAttribute("name");
            Object hsh = hs.getAttribute("hobby");
            Object hss = hs.getAttribute("sex");
            
            if(hsn == null){
                hsn = "";
            }
            if(hsh == null){
                hsh = "";
            }
                String otoko = "";
                String onnna = "";
            if(hss != null){
                if(hss.equals("男")){
                    otoko = "checked";
                }else if(hss.equals("女")){
                    onnna = "checked";
                }
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Session02</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=./Session02 method=post>"+
             "<center>"+
                 "<p>名前<input type=text name=txtName value=" + hsn + "></p>"+
                 "<hr width=20%>"+
                 "<p>性別<br>"+
                    "<input type=radio name=rdoSample value=男 "+ otoko +">男<br>"+
                    "<input type=radio name=rdoSample value=女 "+ onnna +">女"+
                 "</p>"+
                 "<hr width=20%>"+
                 "<p>趣味<textarea name=mulText>"+ hsh +"</textarea></p>"+
                 "<input type=submit name=btnSubmit value=送信><br>"+
             "</center>"+

         "</form>");
            out.println("</body>");
            out.println("</html>");
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
