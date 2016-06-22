/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.RegisterDTO;

/**
 *
 * @author eshine-104
 */
public class RegisterDAO {
    
    public int addUser(RegisterDTO registerDTO){
        try {
            System.out.println("branchDTO =" + registerDTO);
        } catch (Exception e) {
        }
       return 0; 
    }
    
}
