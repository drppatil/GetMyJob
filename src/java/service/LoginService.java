/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.LoginDAO;
import dto.LoginDTO;
import java.sql.SQLException;


/**
 *
 * @author eshine
 */
public class LoginService {

    public LoginDTO checkLogin(LoginDTO loginDTO) throws SQLException {
        LoginDAO loginDAO = new LoginDAO();
        return loginDAO.checkLogin(loginDTO);

    }

}
