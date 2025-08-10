package day11pgm;

import java.util.Scanner;

public class EmployeeMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        
        EmployeePersonalDetails personal = new EmployeePersonalDetails("Likhith", "Male", "likhi123@gmail.com", 9019882080L,
         "Bangalore");
        ProfessionalDetails professional = new ProfessionalDetails("Emp101", "IT", "Software Engineer", 2, "Ravi Kumar");
        EmployeeSalaryDetails salary = new EmployeeSalaryDetails(50000, 10000, 5000, 2500);
        LeaveDetails leaves = new LeaveDetails(12, 8, 5, 2);
        EmloyeeProjects projects = new EmloyeeProjects(1, "Vitamin Deficiency Detection System", 6, "Ongoing");

        
        do {
            System.out.println("\nEmployee Menu");
            System.out.println("=======================");
            System.out.println("1. Display Employee Personal Details.");
            System.out.println("2. Display Employee Professional Details.");
            System.out.println("3. Display Employee Salary Details.");
            System.out.println("4. Display Employee Earned Leaves and Casual Leaves.");
            System.out.println("5. Display Employee Projects Undertaken.");
            System.out.println("6. Exit the Menu.");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    personal.display();
                    break;
                case 2:
                    professional.display();
                    break;
                case 3:
                    salary.display();
                    break;
                case 4:
                    leaves.display();
                    break;
                case 5:
                    projects.display();
                    break;
                case 6:
                    System.out.println("Exiting the Menu. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
