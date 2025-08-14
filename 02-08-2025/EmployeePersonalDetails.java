package day11pgm;

public class EmployeePersonalDetails {
    private String name;
    private String gender;
    private String email;
    private long phone;
    private String address;

    public EmployeePersonalDetails(String name, String gender, String email, long phone, String address) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public void display() {
        System.out.println("Personal Details ---");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}
