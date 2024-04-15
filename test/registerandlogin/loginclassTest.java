/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package registerandlogin;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amala_mn7czj6
 */
public class loginclassTest
{
    
    public loginclassTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of getUsername method, of class loginclass.
     */
    @Test
    public void testGetUsername()
    {
        System.out.println("getUsername");
        loginclass instance = new loginclass();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of setUsername method, of class loginclass.
     */
    @Test
    public void testSetUsername()
    {
        System.out.println("setUsername");
        String username = "";
        loginclass instance = new loginclass();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPassword method, of class loginclass.
     */
    @Test
    public void testGetPassword()
    {
        System.out.println("getPassword");
        loginclass instance = new loginclass();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setPassword method, of class loginclass.
     */
    @Test
    public void testSetPassword()
    {
        System.out.println("setPassword");
        String password = "";
        loginclass instance = new loginclass();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFirstname method, of class loginclass.
     */
    @Test
    public void testGetFirstname()
    {
        System.out.println("getFirstname");
        loginclass instance = new loginclass();
        String expResult = "";
        String result = instance.getFirstname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setFirstname method, of class loginclass.
     */
    @Test
    public void testSetFirstname()
    {
        System.out.println("setFirstname");
        String firstname = "";
        loginclass instance = new loginclass();
        instance.setFirstname(firstname);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getLastname method, of class loginclass.
     */
    @Test
    public void testGetLastname()
    {
        System.out.println("getLastname");
        loginclass instance = new loginclass();
        String expResult = "";
        String result = instance.getLastname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setLastname method, of class loginclass.
     */
    @Test
    public void testSetLastname()
    {
        System.out.println("setLastname");
        String lastname = "";
        loginclass instance = new loginclass();
        instance.setLastname(lastname);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of checkUserName method, of class loginclass.
     */
    @Test
    public void testCheckUserName()
    {
        System.out.println("checkUserName");
        loginclass instance = new loginclass();
        boolean expResult = false;
        boolean result = instance.checkUserName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of checkPasswordComplexity method, of class loginclass.
     */
    @Test
    public void testCheckPasswordComplexity()
    {
        System.out.println("checkPasswordComplexity");
        loginclass instance = new loginclass();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of registerUser method, of class loginclass.
     */
    @Test
    public void testRegisterUser()
    {
        System.out.println("registerUser");
        loginclass instance = new loginclass();
        instance.registerUser();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of loginUser method, of class loginclass.
     */
    @Test
    public void testLoginUser()
    {
        System.out.println("loginUser");
        String inputUsername = "";
        String inputPassword = "";
        loginclass instance = new loginclass();
        boolean expResult = false;
        boolean result = instance.loginUser(inputUsername, inputPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of returnLoginStatus method, of class loginclass.
     */
    @Test
    public void testReturnLoginStatus()
    {
        System.out.println("returnLoginStatus");
        loginclass instance = new loginclass();
        String expResult = "";
        String result = instance.returnLoginStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
