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

/**
 *
 * @author Asus
 */
public class ex3 extends HttpServlet {

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
        String n = request.getParameter("txt");
        String select = request.getParameter("select");

        
        double result = 0;
        String ketqua = "";
        String display = "";
        
        ArrayList<Integer> sole = new ArrayList<>();
        ArrayList<Integer> sochan = new ArrayList<>();

        try{
            double i = Double.parseDouble(n);
            if (i <= 1 || i >= 100) {
            ketqua = " 1<n<100";
            
        } else if (select.equals("Tong n so lien tiep")) {
            result = (i + 1) * (((i - 1) / 1) + 1) / 2;
            ketqua = result + " ";
            
        } else if (select.equals("Tinh n!")) {
            result =1 ;
            for (double num = 2; num <= i; num++) {
                result *= num;
            }
            ketqua = result + " ";
            
        } else if (select.equals("In day le")) {
            for (int num = 2; num <= i; num++) {
                if (num % 2 == 1) {
                    sole.add(num);
                    ketqua += num + " ";
                }
            }
        } else if (select.equals("In day chan")) {
            for (int num = 2; num <= i; num++) {
                if (num % 2 != 1) {
                    sole.add(num);
                    ketqua += num + " ";
                }
            }
        } else if (select.equals("Kiem tra so nguyen to")) {
            int squareRoot = (int) Math.sqrt(i);
            boolean check = true;
            for (int num = 2; num <= squareRoot; num++) {
                if (i % num == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ketqua = "la so nguyen to";
            } else {
                ketqua = "khong la so nguyen to";
            }
        }
            display = ketqua + "";
        }catch(NumberFormatException e){
            display = "hay nhap so";
        }
        
        request.setAttribute("n", n);
        request.setAttribute("display", display);
        request.getRequestDispatcher("ex3.jsp").forward(request, response);
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
