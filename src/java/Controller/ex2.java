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
import static java.lang.Math.sqrt;

/**
 *
 * @author Asus
 */
public class ex2 extends HttpServlet {

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
        String a = request.getParameter("txta");
        String b = request.getParameter("txtb");
        String c = request.getParameter("txtc");
        String radio = request.getParameter("radio");

        double ketqua = 0;
        String display ="";
        try {
            double so1 = Double.parseDouble(a);
            double so2 = Double.parseDouble(b);
            double so3 = Double.parseDouble(c);

            if (radio.equals("max")) {
                if (so1 >= so2 && so1 >= so3) {
                    ketqua = so1;
                }
                if (so2 >= so3 && so2 >= so1) {
                    ketqua = so2;
                }
                if (so3 >= so1 && so3 >= so2) {
                    ketqua = so3;
                }
            }
            
            if (radio.equals("min")) {
                if (so1 <= so2 && so1 <= so3) {
                    ketqua = so1;
                }
                if (so2 <= so3 && so2 <= so1) {
                    ketqua = so2;
                }
                if (so3 <= so1 && so3 <= so2) {
                    ketqua = so3;
                }
            }
         
            display = ketqua + "";
        } catch (NumberFormatException e) {
            display = "hay nhap so";
        }
        
        request.setAttribute("a", a);
        request.setAttribute("b", b);
        request.setAttribute("c", c);
        request.setAttribute("display", display);
        request.getRequestDispatcher("ex2.jsp").forward(request, response);
        
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
