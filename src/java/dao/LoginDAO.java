/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.LoginDTO;

/**
 *
 * @author eshine
 */
public class LoginDAO {

    public LoginDTO checkLogin(LoginDTO loginDTO) {

        System.out.println("dao ==" + loginDTO.getPassword());
        return loginDTO;
    }
}
