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
public class BookIT {
    
    public BookIT() {
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
     * Test of getBookName method, of class Book.
     */
    @Test
    public void testGetBookName() {
        System.out.println("getBookName");
        Book instance = new Book("newBookName","newBookAuthor");
        String expResult = "newBookName";
        String result = instance.getBookName();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getBookAuthor method, of class Book.
     */
    @Test
    public void testGetBookAuthor() {
        System.out.println("getBookAuthor");
        Book instance = new Book("newBookName","newBookAuthor");
        String expResult = "newBookAuthor";
        String result = instance.getBookAuthor();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getBookRating method, of class Book.
     */
    @Test
    public void testGetBookRating() {
        System.out.println("getBookRating");
        Book instance = new Book("newBookName","newBookAuthor");
        float expResult = 0.0F;
        float result = instance.getBookRating();
        assertEquals(expResult, result,0.0);
     
    }

    /**
     * Test of getNoOfRatings method, of class Book.
     */
    @Test
    public void testGetNoOfRatings() {
        System.out.println("getNoOfRatings");
        Book instance = new Book("newBookName","newBookAuthor");
        int expResult = 0;
        int result = instance.getNoOfRatings();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBookName method, of class Book.
     */
    @Test
    public void testSetBookName() {
        System.out.println("setBookName");
        Book instance = new Book("newBookName","newBookAuthor");
        String expResult = "newBookName2";
        instance.setBookName("newBookName2");
        String result = instance.getBookName();
        
        assertEquals(expResult, result);
    }

    /**
     * Test of setBookAuthor method, of class Book.
     */
    @Test
    public void testSetBookAuthor() {
        System.out.println("setBookAuthor");
        Book instance = new Book("newBookName","newBookAuthor");
        String expResult = "newBookAuthor2";
        instance.setBookAuthor("newBookAuthor2");
        String result = instance.getBookAuthor();
                
        assertEquals(expResult, result);
    }

    /**
     * Test of setBookRating method, of class Book.
     */
    @Test
    public void testSetBookRating() {
        System.out.println("setBookRating");
        float bookRating = 0.9F;
        Book instance = new Book("newBookName","newBookAuthor");
        instance.setBookRating(bookRating);
        float result = instance.getBookRating();
        float expResult = 0.9F;
        assertEquals(expResult, result,0.0);
        
    }

    /**
     * Test of setNoOfRatings method, of class Book.
     */
    @Test
    public void testSetNoOfRatings() {
        System.out.println("setNoOfRatings");
        int noOfRatings = 0;
        Book instance = new Book("newBookName","newBookAuthor");
        int expResult = 0;
        int result = instance.getNoOfRatings();
        instance.setNoOfRatings(noOfRatings);
        
    }
    
}
