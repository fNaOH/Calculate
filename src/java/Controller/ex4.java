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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class ex4 extends HttpServlet {

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
        String kq = request.getParameter("ketqua");
        String radio = request.getParameter("radio");
        
        Date date = new Date();

        String display = "";
        ArrayList<Integer> numList = new ArrayList<>();
        
        try {
            String[] arr = kq.split(" ", 0);
            for (String num : arr) {
                numList.add(Integer.parseInt(num));
            }

            switch (radio) {
                case "nhap mang":
                    display = kq ;
                    break;
                case "in mang":
                    for (int num : numList) {
                        display += num + " " ;
                    }
                    break;
                case "tong le":
                    double sum = 0;
                    for (int num : numList) {
                        if (num % 2 == 1) {
                            sum += num;
                        }
                    }
                    display = sum + "";
                    break;
                case "tich chan":
                    double nhan = 1;
                    for (int num : numList) {
                        if (num % 2 == 0) {
                            nhan *= num;
                        }
                    }
                    display = nhan + "";
                    break;
                case "sap xep":
                    Collections.sort(numList);
                    for (int num : numList) {
                        display += num + " ";
                    }
                    break;
            }
        } catch (NumberFormatException e) {
            display = "hay nhap so";
        }
        
        request.setAttribute("Date", date);
        request.setAttribute("radio", radio);
        request.setAttribute("kq", kq);
        request.setAttribute("display", display);
        request.getRequestDispatcher("ex4.jsp").forward(request, response);
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
