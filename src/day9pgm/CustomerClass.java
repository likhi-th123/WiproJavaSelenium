package day9pgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Customer {
    private String customerId;
    private String name;
    private long contact;
    private String location;
    private String email;
    private String gender;
    
	public Customer(String customerId, String name, long contact, String location, String email, String gender) {
		this.customerId = customerId;
		this.name = name;
		this.contact = contact;
		this.location = location;
		this.email = email;
		this.gender = gender;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	public String getName() {
		return name;
	}
	public long getContact() {
		return contact;
	}
	public String getLocation() {
		return location;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", contact=" + contact + ", location="
				+ location + ", email=" + email + ", gender=" + gender + "]";
	}
  
}

public class CustomerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer("101", "Likhi", 9876543210L, "Bengaluru", "likhi12@gmail.com", "Male"));
        customerList.add(new Customer("102", "Rohit", 8765432109L, "Hyderabad", "rohit34@gmail.com", "Male"));
        customerList.add(new Customer("103", "Harika", 7654321098L, "Mumbai", "harika123@gmail.com", "Female"));
        customerList.add(new Customer("104", "Charan", 6543210987L, "Delhi", "charan78@gmail.com", "Male"));
        customerList.add(new Customer("105", "Virat", 5432109876L, "Pune", "virat18@gmail.com", "Male"));

        //Collections.sort(customerList);
        //collections.sort()

        System.out.println("Sorted Customer List:");
        for (Customer cus : customerList) {
            System.out.println(cus);
        }

        if (customerList.size() > 3) {
            customerList.remove(3);
            System.out.println("Removed element at index 3.");
        }

        System.out.println("Enter customer ID to search: ");
        String customerID = sc.nextLine();
        boolean found = false;

        Iterator<Customer> iterator = customerList.iterator();
        while (iterator.hasNext()) {
            Customer cus = iterator.next();
            if (cus.getCustomerId().equalsIgnoreCase(customerID)) {
                System.out.println("Customer Found:");
                System.out.println("Name: " + cus.getName());
                System.out.println("Location: " + cus.getLocation());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Customer " + customerID + " not found in the list.");
        }
    }
}
