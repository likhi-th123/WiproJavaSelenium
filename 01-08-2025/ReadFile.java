package day10pgm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
 
public class ReadFile {
	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("C:/Users/HP/Desktop/batch7_myfirstfile.txt"))) {
           String line;
           while ((line = reader.readLine()) != null) {
              System.out.println(line);
           }
       } catch (IOException e) {
          e.printStackTrace();
       }
   }
}