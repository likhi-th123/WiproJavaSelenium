package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Employee {
    private int id;
    private String name;
    private String department;
    private long phoneNumber;
    private double commission;

    public Employee(int id, String name, String department, long phoneNumber, double commission) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.phoneNumber = phoneNumber;
        this.commission = commission;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public double getCommission() {
        return commission;
    }

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", department=" + department + ", phoneNumber=" + phoneNumber
				+ ", commission=" + commission + "]";
	}

   
}


public class Emp_Detailes {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adding Employees
        empList.add(new Employee(101, "Alice", "HR", 9876543210L, 5000.0));
        empList.add(new Employee(102, "Bob", "IT", 9012345678L, 7000.0));
        empList.add(new Employee(103, "Charlie", "Finance", 9123456789L, 4500.0));

        // Display All Employees
        System.out.println("All Employees:");
        for (Employee emp : empList) {
            System.out.println(emp);
        }

        // Search by ID
        System.out.print("\nEnter Employee ID to search: ");
        int searchId = scanner.nextInt();
        boolean found = false;

        for (Employee emp : empList) {
            if (emp.getId() == searchId) {
                System.out.println("Found: " + emp);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with ID " + searchId + " not found.");
        }

        // Remove by ID
        System.out.print("\nEnter Employee ID to remove: ");
        int removeId = scanner.nextInt();
        Employee toRemove = null;
        for (Employee emp : empList) {
            if (emp.getId() == removeId) {
                toRemove = emp;
                break;
            }
        }

        if (toRemove != null) {
            empList.remove(toRemove);
            System.out.println("Employee removed.");
        } else {
            System.out.println("Employee with ID " + removeId + " not found.");
        }

        // Final List
        System.out.println("\nUpdated Employee List:");
        for (Employee emp : empList) {
            System.out.println(emp);
        }
    }
}
