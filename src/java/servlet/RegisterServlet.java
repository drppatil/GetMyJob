/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.Gson;
import dto.RegisterDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.RegisterService;

/**
 *
 * @author eshine-104
 */
public class RegisterServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegisterServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegisterServlet at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("register Servelet");
        
        Gson gson=new Gson();
        RegisterDTO registerDTO = gson.fromJson(request.getReader(), RegisterDTO.class);
        System.out.println("register dto in servlet"+registerDTO.getFirstName());
         System.out.println("register dto last name =" + registerDTO.getLastName());
            System.out.println("register dto email name =" + registerDTO.getEmail());
            System.out.println("register dto pass name =" + registerDTO.getPassword());
            System.out.println("register dto mobile name =" + registerDTO.getMobile());
            System.out.println("register dto role name =" + registerDTO.getRole());
            System.out.println("register dto city name =" + registerDTO.getCity());
            System.out.println("register dto distri name =" + registerDTO.getDistrict());
            System.out.println("register dto state name =" + registerDTO.getState());
            System.out.println("register dto pin name =" + registerDTO.getPincode());
        RegisterService registerService=new RegisterService();
        registerService.addUser(registerDTO);
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
