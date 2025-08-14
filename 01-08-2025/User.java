package day10pgm;

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;  

    private String username;
    private String email;
    private int age;
    String phoneNumber; 

    public User(String username, String email, int age, String phoneNumber) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + ", age=" + age + ", phoneNumber=" + phoneNumber
				+ "]";
	}
    
}
