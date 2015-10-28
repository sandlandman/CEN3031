/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redblocks;

/**
 *
 * @author andy
 */
public class User {
    private String firstName;
    private UserProfile profile;
    
    public User() {
        profile = new UserProfile();
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
