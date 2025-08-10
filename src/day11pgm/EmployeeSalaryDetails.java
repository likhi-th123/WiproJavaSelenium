package day11pgm;

public class EmployeeSalaryDetails {
    private double basicsal;
    private double hra;
    private double otherallowance;
    private double pf;

    public EmployeeSalaryDetails(double basicsal, double hra, double otherallowance, double pf) {
        this.basicsal = basicsal;
        this.hra = hra;
        this.otherallowance = otherallowance;
        this.pf = pf;
    }

    public void display() {
        double Total = basicsal + hra + otherallowance;
        System.out.println("Salary Details ---");
        System.out.println("Basic Salary: ₹" + basicsal);
        System.out.println("House Rent Allowance: ₹" + hra);
        System.out.println("Allowances: ₹" + otherallowance);
        System.out.println("PF Deduction: ₹" + pf);
        System.out.println("Gross Salary: ₹" + Total);
    }
}
