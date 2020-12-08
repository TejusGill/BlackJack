package ca.sheridancollege.project;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
/**
 *
 * @author gillt
 */
public class TestPlayer {
   public TestPlayer() {
    }

    @Before
    public void setUp() {
        // Add any logic you want to have prior to running each test case
       // System.out.println("This will run before every test case!!");
    }

    @After
    public void tearDown() {
        // Add any logic you want to have after the execution of each test case
       // System.out.println("This will run after every test case!!");
    }

    /**
     * Test of checkLength method, validate the happy path of class PasswordValidator.
     */
    @Test
    public static void testGetNameGood() { 
        System.out.println("check name");
         String name = "kevin";
        boolean expResult = true;
        
        boolean actualResult = ca.sheridancollege.project.Player.getName(name);

        assertEquals(expResult, actualResult);
        
        assertTrue(actualResult);
    }
    
    /**
     * Test of checkLength method, validate the Bad path of class PasswordValidator.
     */
    @Test
    public void testGetNameBad() { 
        System.out.println("check name");
       String name=" ";
        boolean expResult = false;
        
        boolean actualResult = ca.sheridancollege.project.Player.getName(name);

        assertEquals(expResult, actualResult);
        
        assertFalse(actualResult);
    }
    
    /**
     * Test of checkLength method, validate the Boundary path of class PasswordValidator.
     */
    @Test
    public void testGetNameBoundary() { 
        System.out.println("check hidden card");
        String name = "kds" ;
        boolean expResult = true;
        
        boolean actualResult = ca.sheridancollege.project.Player.getName(name);

        assertEquals(expResult, actualResult);
        
        assertTrue(actualResult);
    }
}