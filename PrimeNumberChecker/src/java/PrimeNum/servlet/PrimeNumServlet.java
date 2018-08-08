/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrimeNum.servlet;

import PrimeNum.model.PrimeNumChecker;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Books
 */
public class PrimeNumServlet extends HttpServlet {

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
            
            try {
                String numStr =request.getParameter("num");
                String checkPrime=request.getParameter("prime");;
              
                int num = Integer.valueOf(numStr);
                int count=0;
                
                  for (int i = 1; i <= num; i++) {
                    if (num %i == 0) {
                        
                        count++;
                        
                    
                    }
                }
                  if (count == 2) {
                      
                       checkPrime="Prime Number";
                    
                }else if(count !=2){
                      checkPrime="Not A Prime Number";
                }
                
                  PrimeNumChecker sc = new PrimeNumChecker();
                  sc.setNum(num);
                 sc.setCheckPrime(checkPrime);
                  sc.setCount(count);
                  request.setAttribute("PrimeNum",sc);
                getServletContext().getRequestDispatcher("/PrimeNumChecker.jsp").forward(request, response);
                
              
//                    out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>PrimeNumServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println(String.format("<h1>num=%d <br> count=%d <br> Result=%s </h1>\n",num,count,checkPrime));
//            out.println("</body>");
//            out.println("</html>");
            
                
            
                
            } catch (Exception e) {
//                out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Prime Number</title>");            
//            out.println("</head>");
//            out.println("<body>");
//             out.println("Invalid Input"); 
//            out.println("</body>");
//            out.println("</html>");
            }
            /* TODO output your page here. You may use following sample code. */
            
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
