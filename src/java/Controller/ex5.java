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

/**
 *
 * @author Asus
 */
public class ex5 extends HttpServlet {

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
        String dv = request.getParameter("nhap doan van");
        String vt = request.getParameter("nhap vi tri");
        String nc = request.getParameter("nhap chuoi");
        String tu = request.getParameter("tu");
        String den = request.getParameter("den");

        String demkytu = "";
        String kytutuongung = "";
        String vitrituongung = "";
        String sub = "";
        
        try {
            if (Integer.parseInt(den) <= Integer.parseInt(tu)) {
                sub = "den > tu";
            } else {
                sub = dv.substring(Integer.parseInt(tu), Integer.parseInt(den));
            }
        } catch (NumberFormatException e) {
            sub = "hay nhapp so";
        }
               
        try{
            char kytu = dv.charAt(Integer.parseInt(vt));
            kytutuongung = kytu + "";
        }catch(NumberFormatException e){
            kytutuongung = "hay nhap so";
        }
        
        if(nc.trim().equals("") || nc.isEmpty()){
            vitrituongung = "chuoi nhap vao khong duoc trong";
        }else{
            int vitri = dv.indexOf(nc);
            vitrituongung = vitri + "";
        }
        
        if(dv.trim().equals("") || dv.isEmpty()){
            demkytu= "doan van khong duoc de trong";
        }
        else{
            demkytu = dv.length() + "" ;
        }
        
        
        request.setAttribute("dv", dv);
        request.setAttribute("vt", vt);
        request.setAttribute("nc", nc);
        request.setAttribute("tu", tu);
        request.setAttribute("den", den);
        request.setAttribute("demkytu", demkytu);
        request.setAttribute("kytutuongung", kytutuongung);
        request.setAttribute("vitrituongung", vitrituongung);
        request.setAttribute("sub", sub);
        request.getRequestDispatcher("ex5.jsp").forward(request, response);
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
