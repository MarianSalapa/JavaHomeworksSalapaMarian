/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MMM
 */
public class UserIT {
    
    public UserIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getUser_id method, of class User.
     */
    @Test
    public void testGetUser_id() {
        System.out.println("getUser_id");
        User instance = new User("userName");
        int expResult = 1002;
        int result = instance.getUser_id();
        assertEquals(expResult, result);

    }

    /**
     * Test of getUser_name method, of class User.
     */
    @Test
    public void testGetUser_name() {
        System.out.println("getUser_name");
        User instance = new User("userName");
        String expResult = "userName";
        String result = instance.getUser_name();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of setUser_id method, of class User.
     */
    @Test
    public void testSetUser_id() {
        System.out.println("setUser_id");
        int user_id = 1;
        User instance = new User("userName");
        
        instance.setUser_id(user_id);
        int result=instance.getUser_id();
        assertEquals(1, result);

    }

    /**
     * Test of setUser_name method, of class User.
     */
    @Test
    public void testSetUser_name() {
        System.out.println("setUser_name");
        User instance = new User("userName");
        instance.setUser_name("newUserName");
        String expResult = "newUserName";
        String result = instance.getUser_name();
        assertEquals(expResult, result);
    }
    
}
