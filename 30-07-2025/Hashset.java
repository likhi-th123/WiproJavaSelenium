package day9pgm;

import java.util.HashSet;
import java.util.Objects;
 
class Person {
    private String name;
    private int age;
 
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    
    
 
    // Override hashCode() and equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Combines both fields
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person) obj;
        return age == p.age && Objects.equals(name, p.name);
    }
 
    
 
//@Override
//	public int hashCode() {
//		return Objects.hash(age, name);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)return true;
//		if (obj == null)return false;
//		if (getClass() != obj.getClass())return false;
//		Person other = (Person) obj;
//		return age == other.age && Objects.equals(name, other.name);
//	}




@Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
 
public class Hashset {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
 
        Person p1 = new Person("Harry", 25);
        Person p2 = new Person("Steven", 30);
        Person p3 = new Person("Harry", 25); // Same as p1
 
        people.add(p1);   // p1 is sharing a different memory loc
        people.add(p2);
        people.add(p3); // Will NOT be added (duplicate) // // p3 is sharing a different memory loc
 
 
        System.out.println("People in HashSet:");
        for (Person p : people) {
            System.out.println(p + " - hashCode: " + p.hashCode());
        }
    }
}