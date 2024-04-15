
package registerandlogin;

// @author Adam Malander ST10440725 St10440725@vcconnect.edu.za

public class RegisterAndLogin {

    //making global variable for loginclass instance so that every class can access loginclass methods & attributes
    public static loginclass loginclass = new loginclass();
    
    public static void main(String[] args) {
        
        //line 19 and 22 taken but changed from ChatGPT
        
        //creating the register page
        Register registerpage = new Register();
        
        //making sure the registerpage is visible
        registerpage.setVisible(true);
        
        //centering the application
        registerpage.setLocationRelativeTo(null);
        
        
    }
    
}
