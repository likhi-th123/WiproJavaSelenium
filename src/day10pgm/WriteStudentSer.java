package day10pgm;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class WriteStudentSer {
   public static void main(String[] args) {
	   Student s1 = new Student("Brian",20);
 
       try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {
          out.writeObject(s1);
          System.out.println("Object serialized to student.ser");
       } catch (Exception e) {
          e.printStackTrace();
       }
   }
}