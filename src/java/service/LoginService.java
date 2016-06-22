/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author eshine
 */
@Path("/LoginService")
public class LoginService {

//    @GET
////    @Path("/validUser")
//    @Produces("application/json")
//    public void getUserStatus() {
//
//        System.out.println("inside service function");
//
//    }

    @GET
    @Path("/validUser")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserStatus() {
        System.out.println("inside service function");
        return "Hello Jersey";
    }

}
