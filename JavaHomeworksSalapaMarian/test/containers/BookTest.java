/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author MMM
 */
public class BookTest {
    
 @Test
	public void createBookObjectTestBookName(){
		String bookName = "Book1";
		String bookAuthor = "Author1";
		Book newBook= new Book(bookName,bookAuthor);
		String expected=newBook.getBookName();
		
		assertEquals(expected,bookName);
	}
	
	@Test
	public void createBookObjectTestAuthor(){
		String bookName = "Book1";
		String bookAuthor = "Author1";
		Book newBook= new Book(bookName,bookAuthor);
		String expected=newBook.getBookAuthor();
		
		assertEquals(expected,bookAuthor);
	}

	@Test
	public void createBookObjectTestRating(){
		Book newBook= new Book("Book1","Author1");
		assertTrue(newBook.getBookRating()==0.0f);
	}
	
	@Test
	public void createBookObjectTestNoRatings(){
		Book newBook= new Book("Book1","Author1");
		assertTrue(newBook.getNoOfRatings()==0);
	}
	
	@Test
	public void createBookObjectTestSetBookName(){
		String bookName = "Book1";
		
		Book newBook= new Book("InitialBookName","Author1");
		newBook.setBookName(bookName);
		String expected=newBook.getBookName();
		
		assertEquals(expected,bookName);
	}
	
	@Test
	public void createBookObjectTestSetAuthorName(){
		
		String bookAuthor = "Author1";
		Book newBook= new Book("bookName","InitialbookAuthor");
		newBook.setBookAuthor(bookAuthor);
		String expected=newBook.getBookAuthor();
		
		assertEquals(expected,bookAuthor);
	}
   
    
}
