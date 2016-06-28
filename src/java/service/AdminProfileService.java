/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.AdminProfileDAO;
import dao.LoginDAO;
import dto.AdminProfileDTO;
import java.sql.SQLException;

/**
 *
 * @author eshine
 */
public class AdminProfileService {

    public AdminProfileDTO getAdminProfile(String email) throws SQLException {
        AdminProfileDAO adminProfileDAO = new AdminProfileDAO();
        return adminProfileDAO.getAdminProfile(email);

    }

}
