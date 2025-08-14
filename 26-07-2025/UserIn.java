package practice;
import java.util.Scanner;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class UserIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of students: ");
            int count = sc.nextInt();

            for (int i=0; i<count; i++) {
                System.out.print("Enter student name: ");
                String Sname = sc.next();

                System.out.print("Enter grade for " + Sname + ": ");
                int Sgrade = sc.nextInt();

                if (Sgrade<0 || Sgrade>100) {
                    throw new InvalidGradeException("Grade must be b/w 0 To 100.");
                }
                System.out.println("Student Name: " + Sname + "\nGrade: " + Sgrade);
            }
        } catch (InvalidGradeException e) {
            System.out.println("Error:" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        } finally {
        	sc.close();
            System.out.println("Scanner closed.");
        }
    }
}
