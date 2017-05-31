/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BlackJack.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author issei
 */
public class BlackJack extends HttpServlet {

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
            
            Dealer dealer = new Dealer();
            User user = new User(); 
            
            dealer.setCard(dealer.deal());
            out.println("ディーラーHand[" + dealer.myCard.get(0) + ",?]　<br>");
            
            user.setCard(dealer.deal());
            out.println("プレイヤーHand" + user.myCard + "　Total：" + user.open()[0] +" or " + user.open()[1] + "<br><br>");
            
            while(user.checkSum(user.open()) == true){
                user.setCard(dealer.hit());
                out.println("プレイヤーHit<br>");
                out.println("プレイヤーHand" + user.myCard + "　Total：" + user.open()[0] +" or " + user.open()[1] + "<br><br>");
            }
            
            if(user.open()[0] > 21){
                out.println("プレイヤーBust<br>ディーラーWIN...end");
            }else{
                out.println("プレイヤーStand<br><br>");
                
                out.println("ディーラーHand open" + dealer.myCard + "Total：" + dealer.open()[0] +" or " + dealer.open()[1] + "<br><br>");
            
                while(dealer.checkSum(dealer.open()) == true){
                    dealer.setCard(dealer.hit());
                    out.println("ディーラーCard draw<br>");
                    out.println("ディーラーHand" + dealer.myCard + "　Total：" + dealer.open()[0] +" or " + dealer.open()[1] + "<br><br>");
                }
                
                int dOpen;
                if(dealer.open()[1] > 21){
                    dOpen = dealer.open()[0];
                }else{
                    dOpen = dealer.open()[1];
                }
                
                int uOpen;
                if(user.open()[1] > 21){
                    uOpen = user.open()[0];
                }else{
                    uOpen = user.open()[1];
                }
                
                if(dealer.open()[0] > 21){
                    out.println("ディーラーBust<br>プレイヤーWIN...end");
                }else if(dOpen > uOpen){
                    out.print("ディーラーHand" + dealer.myCard + "　Total：" + dOpen + "<br>");
                    out.print("プレイヤーHand" + user.myCard + "　Total：" + uOpen + "<br>");
                    out.print("ディーラーWIN...end");
                    
                }else if(dOpen < uOpen){
                    out.print("ディーラーHand" + dealer.myCard + "　Total：" + dOpen + "<br>");
                    out.print("プレイヤーHand" + user.myCard + "　Total：" + uOpen + "<br>");
                    out.print("プレイヤーWIN...end");
                    
                }else if(dOpen == uOpen){
                    out.print("ディーラーHand" + dealer.myCard + "　Total：" + dOpen + "<br>");
                    out.print("プレイヤーHand" + user.myCard + "　Total：" + uOpen + "<br>");
                    out.print("Draw...end");
                }
            }
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BlackJack</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1></h1>");
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
