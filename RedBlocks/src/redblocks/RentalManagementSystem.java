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
public class RentalManagementSystem {
    private String csvFile = "C:\\Users\\andy\\Desktop\\CEN3031\\RedBlocks\\src\\redblocks\\users.csv";
    private boolean validUser;
    private BufferedReader br = null;
    public void read() {
	
    }
    
    public void register(String firstName, String last) {
        
    }
    
    public String[] getUserInfo(String loggedInUserID) {
        String[] userInfo = null;
        
        String line = "";
	String cvsSplitBy = ",";

	try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                userInfo = line.split(cvsSplitBy);
                if(userInfo[0].equals(loggedInUserID)) {
                    return userInfo;
                }
            }
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
            if (br != null) {
                    try {
                            br.close();
                    } catch (IOException e) {
                            e.printStackTrace();
                    }
            }
	}
        
        return null;
    }
    
    public String logIn(String email, String password) {
        validUser = false;
        
        String line = "";
	String cvsSplitBy = ",";

	try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] userInfo = line.split(cvsSplitBy);

                if(userInfo[3].equals(email)) {
                    if(userInfo[4].equals(password)) {
                        return userInfo[0];
                    }
                }
            }
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	} finally {
            if (br != null) {
                    try {
                            br.close();
                    } catch (IOException e) {
                            e.printStackTrace();
                    }
            }
	}
        
        return null;
    }
}
