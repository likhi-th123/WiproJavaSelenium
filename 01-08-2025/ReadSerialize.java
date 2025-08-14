package day10pgm;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSerialize {
   public static void main(String[] args) {
       try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {
    	   Student s = (Student) in.readObject();
          s.display();
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}