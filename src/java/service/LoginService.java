/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.LoginDAO;
import dto.LoginDTO;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author eshine
 */
public class LoginService {

    public LoginDTO checkLogin(LoginDTO loginDTO) {
        LoginDAO loginDAO = new LoginDAO();
        return loginDAO.checkLogin(loginDTO);

    }

}
