package day9pgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NameCompa implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }

    // Main method to test
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Zara", 22));
        students.add(new Student("Alice", 21));
        students.add(new Student("Bob", 20));

        System.out.println("Before sorting Name:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Sort using NameComparator
        Collections.sort(students, new NameCompa());

        System.out.println("\nAfter sorting by name:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}