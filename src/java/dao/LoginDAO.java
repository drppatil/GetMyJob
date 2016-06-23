/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.LoginDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DataBaseConnection;

/**
 *
 * @author eshine
 */
public class LoginDAO {

    public LoginDTO checkLogin(LoginDTO loginDTO) throws SQLException {

        System.out.println("email-->>>" + loginDTO.getEmail());

        DataBaseConnection dbconnection = new DataBaseConnection();
        Connection connection = dbconnection.getConnection();
        String strSelectUser = "select * from User";

        PreparedStatement preparedStatement = connection.prepareStatement(strSelectUser);
        ResultSet result = preparedStatement.executeQuery();

        while (result.next()) {

            System.out.println("email->>>" + result.getString("email"));

        }
        return loginDTO;
    }

}
