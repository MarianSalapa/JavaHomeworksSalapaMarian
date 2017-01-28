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
public class UserTest {
    @Test
	public void CreateUserObjectGetName(){
		String name = "nameUser1";
		User newUser= new User(name);
		String expected=newUser.getUser_name();
		assertEquals(expected,name);
	}
	
	@Test
	public void CreateUserObjectGetId(){
		User newUser= new User("name");
		assertTrue(newUser.getUser_id() == 1001);
	}

	

	@Test
	public void CreateUserObjectSetName(){
		String name = "nameUser1";
		User newUser= new User("initialName");
		newUser.setUser_name(name);
		String expected=newUser.getUser_name();
		assertEquals(expected,name);
	}
   
}
