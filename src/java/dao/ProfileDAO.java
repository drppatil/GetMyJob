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
public class ProfileDAO {

    private static int uid;
    private String role = "";

    public RegisterDTO getUserProfile(String email) {

        System.out.println("Profile DAO email=" + email);

        RegisterDTO registerDTO = new RegisterDTO();
        DataBaseConnection dbConnection = new DataBaseConnection();
        Connection connection = dbConnection.getConnection();

        try {
            String strQuery = "select * from User where User.email='" + email + "'";
            PreparedStatement ps = connection.prepareStatement(strQuery);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                uid = rs.getInt("user_id");
                role = rs.getString("role");
            }
            System.out.println("uid=" + uid);
            String query = "select * from Address where Address.user_id=" + uid + "";
            PreparedStatement ps1 = connection.prepareStatement(query);
            ResultSet rs1 = ps1.executeQuery();
            while (rs1.next()) {
                registerDTO.setFirstName(rs1.getString("first_name"));
                System.out.println("first Name=" + rs1.getString("first_name"));
                registerDTO.setLastName(rs1.getString("last_name"));
                registerDTO.setMobile(rs1.getString("mobile"));
                registerDTO.setCity(rs1.getString("city"));
                registerDTO.setDistrict(rs1.getString("district"));
                registerDTO.setState(rs1.getString("state"));
                registerDTO.setPincode(rs1.getString("pincode"));
                registerDTO.setRole(role);
                registerDTO.setEmail(email);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return registerDTO;
    }

    public void updateProfile(RegisterDTO registerDTO) {

        DataBaseConnection dbConnection = new DataBaseConnection();
        Connection connection = dbConnection.getConnection();

        System.out.println("update profile DAO=" + registerDTO.getCity());
        System.out.println("update profile uid=" + uid);

        try {

            String query = "update Address set first_name=?,last_name=?,mobile=?,city=?,district=?,state=?,pincode=? where Address.user_id=" + uid + "";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, registerDTO.getFirstName());
            ps.setString(2, registerDTO.getLastName());
            ps.setString(3, registerDTO.getMobile());
            ps.setString(4, registerDTO.getCity());
            ps.setString(5, registerDTO.getDistrict());
            ps.setString(6, registerDTO.getState());
            ps.setString(7, registerDTO.getPincode());
            ps.executeUpdate();

            String q = "update User set email=?,role=? where User.user_id=" + uid + "";
            PreparedStatement ps1 = connection.prepareStatement(q);
            ps1.setString(1, registerDTO.getEmail());
            ps1.setString(2, registerDTO.getRole());
            ps1.executeUpdate();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
