package day11pgm;

public class ProfessionalDetails {
    private String empId;
    private String department;
    private String designation;
    private int experience;
    private String reportingManager;

    public ProfessionalDetails(String empId, String department, String designation, int experience, String reportingManager) {
        this.empId = empId;
        this.department = department;
        this.designation = designation;
        this.experience = experience;
        this.reportingManager = reportingManager;
    }

    public void display() {
        System.out.println("Professional Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + department);
        System.out.println("Designation: " + designation);
        System.out.println("Reporting Manager: " + reportingManager);
    }
}
