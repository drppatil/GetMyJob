/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.google.gson.Gson;
import dto.AdminProfileDTO;
import dto.LoginDTO;
import java.io.BufferedReader;
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
import org.json.JSONException;
import org.json.JSONObject;
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
        String email = null;
        Gson gson = new Gson();
//        AdminProfileDTO adminProfileDTO = gson.fromJson(request.getReader(), AdminProfileDTO.class);

        StringBuilder sb = new StringBuilder();
        BufferedReader br = request.getReader();
        String str = null;
        while ((str = br.readLine()) != null) {
            sb.append(str);
        }
        JSONObject jObj;
        try {
            jObj = new JSONObject(sb.toString());
            email = jObj.getString("email");
        } catch (Exception ex) {
            Logger.getLogger(GetAdminProfileServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

        AdminProfileService adminProfileService = new AdminProfileService();
        AdminProfileDTO adminProfileDTO1 = null;

        try {
            adminProfileDTO1 = adminProfileService.getAdminProfile(email);
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
