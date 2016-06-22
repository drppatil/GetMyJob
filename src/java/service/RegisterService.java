/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.RegisterDAO;
import dto.RegisterDTO;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author eshine-104
 */
public class RegisterService {
    
//    RegisterDAO registerDAO=new RegisterDAO();
//    private static final String SUCCESS_RESULT="<result>success</result>";
//   private static final String FAILURE_RESULT="<result>failure</result>";
//    
//   @PUT
//   @Path("/register")
//   @Produces(MediaType.APPLICATION_JSON)
//   @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
//   public String createUser(@FormParam("firstName") String firstName,
//      @FormParam("lastName") String lastName,
//      @FormParam("email") String email,
//      @FormParam("password") String password,
//      @FormParam("mobile") String mobile,
//      @FormParam("city") String city,
//      @FormParam("district") String district,
//      @FormParam("state") String state,
//      @FormParam("pincode") String pincode,
//      @Context HttpServletResponse servletResponse) throws IOException{
//       RegisterDTO registerDTO = new RegisterDTO(firstName,lastName,email,password,mobile,city,district,state,pincode);
//      int result = registerDAO.addUser(registerDTO);
//      if(result == 1){
//         return SUCCESS_RESULT;
//      }
//      return FAILURE_RESULT;
//   }
    public void addUser(RegisterDTO registerDTO){
        RegisterDAO registerDAO=new RegisterDAO();
        registerDAO.addUser(registerDTO);
    }
    
}
