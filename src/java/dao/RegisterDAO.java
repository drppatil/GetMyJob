/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.RegisterDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.DataBaseConnection;

/**
 *
 * @author eshine-104
 */
public class RegisterDAO {

    public int addUser(RegisterDTO registerDTO) {
        try {
            System.out.println("branchDTO first name =" + registerDTO.getFirstName());
            System.out.println("branchDTO last name =" + registerDTO.getLastName());
            System.out.println("branchDTO email name =" + registerDTO.getEmail());
            System.out.println("branchDTO pass name =" + registerDTO.getPassword());
            System.out.println("branchDTO mobile name =" + registerDTO.getMobile());
            System.out.println("branchDTO role name =" + registerDTO.getRole());
            System.out.println("branchDTO city name =" + registerDTO.getCity());
            System.out.println("branchDTO distri name =" + registerDTO.getDistrict());
            System.out.println("branchDTO state name =" + registerDTO.getState());
            System.out.println("branchDTO pin name =" + registerDTO.getPincode());
            DataBaseConnection dbconnection = new DataBaseConnection();
            Connection connection = dbconnection.getConnection();
            String query = "insert into User(email,password,role)values(?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, registerDTO.getEmail());
            preparedStatement.setString(2, registerDTO.getPassword());
            preparedStatement.setString(3, registerDTO.getRole());
            int result = preparedStatement.executeUpdate();

            String max_id = "select max(user_id) from User";
            int user_id = 0;
            PreparedStatement ps = connection.prepareStatement(max_id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                user_id = rs.getInt(1);
            }

            String query1 = "insert into Address(user_id,first_name,last_name,mobile,city,district,state,pincode)values(?,?,?,?,?,?,?,?)";
            PreparedStatement ps_address = connection.prepareStatement(query1);
            ps_address.setInt(1, user_id);
            ps_address.setString(2, registerDTO.getFirstName());
            ps_address.setString(3, registerDTO.getLastName());
            ps_address.setString(4, registerDTO.getMobile());
            ps_address.setString(5, registerDTO.getCity());
            ps_address.setString(6, registerDTO.getDistrict());
            ps_address.setString(7, registerDTO.getState());
            ps_address.setString(8, registerDTO.getPincode());
            int int_res = ps_address.executeUpdate();
            System.out.println("result=" + result);
            System.out.println("res=" + int_res);

        } catch (Exception e) {
        }
        return 0;
    }

}
