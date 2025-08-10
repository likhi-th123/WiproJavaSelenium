package jdbcmysql;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertRecord insert = new InsertRecord();
        DeleteRecord delete = new DeleteRecord();
        UpdateRecord update = new UpdateRecord();
        DisplayRecord display = new DisplayRecord();

        int choice = 0;
        do {
            try {
                System.out.println("\nEmployee Menu");
                System.out.println("--------------");
                System.out.println("1. Insert a new Record");
                System.out.println("2. Delete a record");
                System.out.println("3. Update the record");
                System.out.println("4. Display all the records");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        insert.insertEmployee(sc);
                        break;
                    case 2:
                        delete.deleteEmployee(sc);
                        break;
                    case 3:
                        update.updateEmployee(sc);
                        break;
                    case 4:
                        display.displayAll();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice! Please select between 1 and 5.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                sc.nextLine();
            }
        } while (choice != 5);

        sc.close();
    }
}
