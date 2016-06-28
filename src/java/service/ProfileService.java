/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.ProfileDAO;
import dto.RegisterDTO;

/**
 *
 * @author eshine-104
 */
public class ProfileService {
    
    public RegisterDTO getProfile(){
        ProfileDAO profileDAO=new ProfileDAO();
        String email="amol@gmail.com";
        return profileDAO.getUserProfile(email);
    }
    public void updateProfile(RegisterDTO registerDTO){
        ProfileDAO profileDAO=new ProfileDAO();
        profileDAO.updateProfile(registerDTO);
    }
}
