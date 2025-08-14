package day10pgm;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializeUser {
    public static void main(String[] args) throws IOException {
        // Create User object with all values
        User user = new User("alice", "alice@example.com", 25, "9876543210");

        // Serialize to file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));
        out.writeObject(user);
        out.close();

        System.out.println(user);
    }
}
