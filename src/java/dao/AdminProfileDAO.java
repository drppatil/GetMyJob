/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.AdminProfileDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DataBaseConnection;

/**
 *
 * @author eshine
 */
public class AdminProfileDAO {

    public AdminProfileDTO getAdminProfile(String email) throws SQLException {
        int user_id = 0;
        String emailID = "aaaa@dd.gg";
        AdminProfileDTO adminProfileDTO = new AdminProfileDTO();
        DataBaseConnection dbconnection = new DataBaseConnection();
        Connection connection = dbconnection.getConnection();
        String selectUserQuery = "SELECT * FROM GETJOB.User where email='" + email + "'";
        PreparedStatement preparedStatement = connection.prepareStatement(selectUserQuery);
        ResultSet result = preparedStatement.executeQuery();
        while (result.next()) {
            
            user_id = result.getInt("user_id");
            adminProfileDTO.setEmail(result.getString("email"));
            adminProfileDTO.setRole(result.getString("role"));

        }

        String selectUserAddressQuery = "SELECT * FROM GETJOB.Address where user_id=" + user_id;
        PreparedStatement preparedStatementUserAdd = connection.prepareStatement(selectUserAddressQuery);
        ResultSet resultAdd = preparedStatementUserAdd.executeQuery();
        while (resultAdd.next()) {
            adminProfileDTO.setFirstName(resultAdd.getString("first_name"));
            adminProfileDTO.setLastName(resultAdd.getString("last_name"));
            adminProfileDTO.setMobile(resultAdd.getString("mobile"));
            adminProfileDTO.setCity(resultAdd.getString("city"));
            adminProfileDTO.setDistrict(resultAdd.getString("district"));
            adminProfileDTO.setState(resultAdd.getString("state"));
            adminProfileDTO.setPincode(resultAdd.getString("pincode"));

        }

        return adminProfileDTO;
    }
}
