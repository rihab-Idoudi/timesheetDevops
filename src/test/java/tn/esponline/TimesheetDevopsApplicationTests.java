package tn.esponline;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import tn.esponline.entities.User;
import tn.esponline.service.IUserService;

@SpringBootTest
class TimesheetDevopsApplicationTests {
	@Autowired
	IUserService userService;

	@Test
	void testRetrieveAllUsers() {
		
		List<User> listUsers= userService.retrieveAllUsers();
		assertNotEquals(listUsers.size(), 1);
	}

}
