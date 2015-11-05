


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblocks;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author andy
 */
public class User {
    private String firstName;
    private UserProfile profile;
    
    
    
    
    public User(String [] str) throws IOException {
       
        profile = new UserProfile();
        profile.setUserID(str[0]);
        profile.setFirstName(str[1]);
        profile.setLastName(str[2]);
        profile.setEmail(str[3]);
        profile.setPassword(str[4]);
        profile.setAddress(str[5]);
        profile.setCity(str[6]);
        profile.setState(str[7]);
        profile.setZip(str[8]);
       
      
   
  
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    
    
    /*
    This is an important method, if you want to set or get profile info from 
    any class besides User, you must go through this method
    ex) String firstName = workingUser.ProfileInfo().getFirstName();
    */
    public UserProfile ProfileInfo() {
        return this.profile;
    }
    
}

