package project;

public class User {
	private String id;
	private String name;
	private String location;
	
	
public User(String id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}
// Getters
	public String getId() { return id; }
	public String getName() { return name; }
	public String getlocation() {return location;}
}

