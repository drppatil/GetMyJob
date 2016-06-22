/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author eshine-104
 */
public class RegisterDTO {
    
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String mobileno;
    private String city;
    private String district;
    private String state;
    private String pincode;
    
    
    public RegisterDTO(){}

   public RegisterDTO(String firstName, String lastName, String email,String password, String mobile,
           String city, String district,String state,String pincode){
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
      this.password= password;
      this.mobileno = mobile;
      this.city = city;
      this.district = district;
      this.state = state;
      this.pincode = pincode;
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }


    
}
