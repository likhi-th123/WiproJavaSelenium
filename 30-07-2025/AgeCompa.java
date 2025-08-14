package day9pgm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeCompa implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getAge(), s2.getAge());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 20));
        students.add(new Student("Charlie", 25));

        System.out.println("Before sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using AgeComparator
        Collections.sort(students, new AgeCompa());

        System.out.println("\nAfter sorting by age:");
        for (Student s : students) {
            System.out.println(s);
        }
        
      //Second Approach
      		//Using Anonymous class
      		System.out.println("After sorting: The age of the Students...");
      		Collections.sort(students,new Comparator<Student>() {
      			public int compare(Student s1,Student s2) {
      				return Integer.compare(s1.getAge(), s2.getAge());
      			}});
      		for(Student sage:students) {
      			System.out.println(sage.getAge());
      		}
        
      //Third Approach
      		//Using Lambda Expression
        	students.sort((s1,s2)->Integer.compare(s1.getAge(),s2.getAge()));
      		// To iterate the elements of the ArrayList
        	students.forEach(System.out::println);
      	}
    }