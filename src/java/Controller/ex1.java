/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.cal;

/**
 *
 * @author Asus
 */
public class ex1 extends HttpServlet {

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
        double ketqua = 0;
        String display = "";
        String a = request.getParameter("txta");
        String b = request.getParameter("txtb");
        try {

            double so1 = Double.parseDouble(a);
            double so2 = Double.parseDouble(b);

            String action = request.getParameter("action");

            cal c = new cal();

            if (action.equals("a+b")) {
                ketqua = c.sum(so1, so2);
            }
            if (action.equals("a-b")) {
                ketqua = c.minus(so1, so2);
            }
            if (action.equals("a*b")) {
                ketqua = c.multiply(so1, so2);
            }
            if (action.equals("a/b")) {
                ketqua = c.division(so1, so2);
            }
            display = ketqua + "";

        } catch (NumberFormatException e) {
            display = "hay nhap so";
        }
        
        request.setAttribute("a" , a);
        request.setAttribute("b" , b);
        request.setAttribute("display" , display);
        request.getRequestDispatcher("ex1.jsp").forward(request, response);
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
