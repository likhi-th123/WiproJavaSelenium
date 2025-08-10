package day10pgm;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializerUser {
    public static void main(String[] args) throws Exception {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("user.ser"));

        User user = (User) in.readObject();
        in.close();

        System.out.println(user);
    }
}
