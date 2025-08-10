package practice;

import java.util.Scanner;

public class SecureDataHandler {

    private String encryptedData = "";

    // Encrypts the data by reversing the string
    private String encrypt(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    // Decrypts the data by reversing it back
    private String decrypt(String data) {
        return new StringBuilder(data).reverse().toString();
    }

    // Adds data after encrypting
    public void addData(String data) {
        this.encryptedData = encrypt(data);
    }

    // Returns decrypted data or blank if none exists
    public String getData() {
        if (this.encryptedData.isEmpty()) {
            return "";
        }
        return decrypt(this.encryptedData);
    }

    // Deletes stored data
    public void deleteData() {
        this.encryptedData = "";
    }

    // Main method
    public static void main(String[] args) {
        SecureDataHandler handler = new SecureDataHandler();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    String data = scanner.nextLine();
                    handler.addData(data);
                    break;
                case 2:
                    System.out.println(handler.getData());
                    break;
                case 3:
                    handler.deleteData();
                    System.out.println("Deleted Successfully.");
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option ");
                    return;
            }
        }
    }
}
