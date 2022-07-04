/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package poe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abide
 */
public class LoginTest
{
    
   
    

    @Test
    public void testCheckPasswordComplexity()
    {
        System.out.println("checkPasswordComplexity");
        String Password = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName()
    {
        System.out.println("checkUserName");
        String UserName = "";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(UserName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}

    

   
    
    
    