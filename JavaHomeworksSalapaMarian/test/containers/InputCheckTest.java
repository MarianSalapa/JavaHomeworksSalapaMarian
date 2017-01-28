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
public class InputCheckTest {
  @Test
	public void shouldReturnIntValue(){
		int expected = 4;
		int testVar=InputCheck.checkValidInt();//insert "4"
		assertEquals(expected,testVar);
	}	
	@Test
	public void shouldReturn8(){
			//the method will return 8 if we enter other type than int (char, double) 
			int expected = 8;
			int testVar=InputCheck.checkValidInt();//insert "y"
			assertEquals(expected,testVar);	
	}
}
