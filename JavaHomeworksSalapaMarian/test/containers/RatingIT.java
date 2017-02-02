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
public class RatingIT {
    
    public RatingIT() {
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
     * Test of getStars method, of class Rating.
     */
    @Test
    public void testGetStars() {
        System.out.println("getStars");
        Rating instance = new Rating(0.0F,10,"description");
        float expResult = 0.0F;
        float result = instance.getStars();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getUser_id method, of class Rating.
     */
    @Test
    public void testGetUser_id() {
        System.out.println("getUser_id");
        Rating instance = new Rating(0.0F,10,"description");
        int expResult = 10;
        int result = instance.getUser_id();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getDescription method, of class Rating.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Rating instance = new Rating(0.0F,10,"description");
        String expResult = "description";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStars method, of class Rating.
     */
    @Test
    public void testSetStars() {
        System.out.println("setStars");
        float stars = 0.5F;
        Rating instance = new Rating(0.0F,10,"description");
        instance.setStars(stars);
        
        float result = instance.getStars();
        assertEquals(0.5F, result, 0.0);
    }

    /**
     * Test of setUser_id method, of class Rating.
     */
    @Test
    public void testSetUser_id() {
        System.out.println("setUser_id");
        int expResult=99;
        Rating instance = new Rating(0.0F,10,"description");
        instance.setUser_id(99);
        int result = instance.getUser_id();
        assertEquals(expResult, result);

    }

    /**
     * Test of setDescription method, of class Rating.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "newDesc";
        Rating instance = new Rating(0.0F,10,"description");
        instance.setDescription(description);
        String expResult = "newDesc";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }
    
}
