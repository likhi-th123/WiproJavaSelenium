package day10pgm;

import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
   public static void main(String[] args) {
       try (FileWriter writer = new FileWriter("C:/Users/HP/Desktop/batch7_myfirstfile.txt")) {
          writer.write("Hello, Java File Handling!");
       } catch (IOException e) {
          e.printStackTrace();
       }
   }
}