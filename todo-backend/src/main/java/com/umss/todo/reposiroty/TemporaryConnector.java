/*
 * This is a temporary class for testing.
*/
package com.umss.todo.reposiroty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.umss.todo.User;

@Repository("temporary")
public class TemporaryConnector implements SqlConnector {
	
	private List<User> response;
	
	public TemporaryConnector() {
		response = new ArrayList<User>();
		User user = new User();
		user.setId(1L);
		user.setFirstName("Test");
		user.setLastName("Example");
		user.setEmail("test.example@gmail.com");
		user.setPassword("123456");
		response.add(user);
		User user2 = new User();
		user2.setId(2L);
		user2.setFirstName("Raúl");
		user2.setLastName("Barrientos");
		user2.setEmail("raul.barrientos@gmail.com");
		user2.setPassword("asdfghjklñ");
		response.add(user2);
	}
	
	@Override
	public List<User> getAllUsers() {
		return response;
	}
}
