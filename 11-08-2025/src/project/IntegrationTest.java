package project;

import java.io.IOException;
import java.util.List;

public class IntegrationTest {
	public static void main(String[] args) throws IOException {
	// Setup
		String testFilePath = "C:/Users/HP/Desktop/test_users.txt/";
		UserRepository repo = new UserRepository(testFilePath);
		
		repo.clear(); // make sure the file is empty before testing
		UserService service = new UserService(repo);
		
		// Test
		service.registerUser("1", "Likhith","Bengaluru");
		service.registerUser("2", "Charan","Mumbai");
		service.registerUser("3", "Virat","Hydrabad");
		
		List<User> users = service.getAllUsers();
		assert users.size() == 3 : "Expected 3 users";
		assert users.get(0).getName().equals("Likhith");
		assert users.get(1).getName().equals("Charan");
		assert users.get(1).getName().equals("Virat");
		
		System.out.println("Integration test passed!");
		
		// Clean up
//		repo.clear();
	}
}

