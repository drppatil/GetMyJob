/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.Gson;
import dto.AdminProfileDTO;
import dto.LoginDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.AdminProfileService;
import service.LoginService;
import util.CreateResponse;

/**
 *
 * @author eshine
 */
public class GetAdminProfileServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Gson gson = new Gson();
        AdminProfileDTO adminProfileDTO = gson.fromJson(request.getReader(), AdminProfileDTO.class);

        AdminProfileService adminProfileService = new AdminProfileService();
        AdminProfileDTO adminProfileDTO1 = null;

        try {
            adminProfileDTO1 = adminProfileService.getAdminProfile();
        } catch (SQLException ex) {
            Logger.getLogger(GetAdminProfileServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        gson = new Gson();
        String strResult = gson.toJson(CreateResponse.setObjectResponse(adminProfileDTO1));
        //System.out.println("Data again::"+ strResult);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.write("" + strResult);
        out.flush();
        out.close();

    }

}
