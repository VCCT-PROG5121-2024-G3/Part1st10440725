package registerandlogin;

import javax.swing.JOptionPane;

// @author Adam Malander ST10440725 St10440725@vcconnect.edu.za
public class loginclass {
//-------------------------------attributes-------------------------------------    

    private String username;
    private String password;
    private String firstname;
    private String lastname;

//------------------------------------------------------------------------------
//-------------------------start of constructors--------------------------------    
    //defualt constructor
    public loginclass() {
    }

    //master constructor
    public loginclass(String username, String password, String firstname, String lastname) {
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }
//--------------------------end of constructors---------------------------------

//------------------------start of getters and setters--------------------------    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

//-----------------------end of getters and setters-----------------------------
//-------------------------start of custom methods------------------------------    
    public boolean checkUserName() {
        //this code was taken but changed from ChatGPT
        if (username.contains("_") && username.length() <= 5) {
            return true;
        } else {
            return false;
        }

    }

//---------------------method to check if password is valid---------------------
    public boolean checkPasswordComplexity() {

        //this code was taken but changed from ChatGPT
        //booleans to flag if password contains a digit, uppercase and a symbol
        boolean bDigit = false;
        boolean bUcase = false;
        boolean bSymbol = false;

        //looping through each character of password
        for (int i = 0; i < password.length(); i++) {

            //checking if character is uppercase
            if (Character.isDigit(password.charAt(i))) {
                bDigit = true;

                //checking if character is a digit  
            } else if (Character.isUpperCase(password.charAt(i))) {
                bUcase = true;

                //if character is not a digit or letter then its a symbol
            } else if (Character.isLetterOrDigit(password.charAt(i)) == false) {
                bSymbol = true;
            }

        }
        //if all conditions are true then return true and password is valid else return false
        if (bDigit == true && bUcase == true && bSymbol == true && password.length() >= 8) {
            return true;
        } else {
            return false;
        }

    }
//------------------------------------------------------------------------------

//---------method to register user if username and password is valid------------
    public void registerUser() {
 
        //if username method returns false then a suitable message is dislayed
        if (checkUserName() == false) {
            JOptionPane.showMessageDialog(null, "Username is incorrectly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length");
        }     
        //if the password method returns a false then a suitable message is displayed
        else if (checkPasswordComplexity() == false) {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter and a special character");
        } 
        //if username and password methods both return true then a suitble message is displayed
        else {
            JOptionPane.showMessageDialog(null, "Username and password has been captured");
        }
    }
//------------------------------------------------------------------------------

//method to login user if the details entered matches the details the user registered with
    public boolean loginUser(String inputUsername, String inputPassword) {
        if (username.equals(inputUsername) && password.equals(inputPassword)) {
            return true;
        } else {
            return false;
        }
    }
//------------------------------------------------------------------------------

//------------method to display message if successfully logged in---------------    
    public String returnLoginStatus() {

        return "Welcome " + firstname + ", " + lastname + " it is great to see you again";

    }
//------------------------------------------------------------------------------
//----------------------------end of custom methods-----------------------------
}
