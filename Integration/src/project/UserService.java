package project;

import java.io.IOException;
import java.util.List;

public class UserService {
	private UserRepository repository;
	
	public UserService(UserRepository repository) {
		this.repository = repository;
	}
	
	public void registerUser(String id, String name, String location) throws IOException {
		User user = new User(id, name,location);
		repository.save(user);
	}
	
	public List<User> getAllUsers() throws IOException {
		return repository.findAll();
	}
}

