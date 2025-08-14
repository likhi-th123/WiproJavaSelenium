package day11pgm;

public class LeaveDetails {
    private int earnedLeaves;
    private int casualLeaves;
    private int sickLeaves;
    private int parentalLeaves;

    public LeaveDetails(int earnedLeaves, int casualLeaves, int sickLeaves, int parentalLeaves) {
        this.earnedLeaves = earnedLeaves;
        this.casualLeaves = casualLeaves;
        this.sickLeaves = sickLeaves;
        this.parentalLeaves = parentalLeaves;
    }

    public void display() {
        System.out.println("Leave Details ---");
        System.out.println("Earned Leaves: " + earnedLeaves);
        System.out.println("Casual Leaves: " + casualLeaves);
        System.out.println("Sick Leaves: " + sickLeaves);
        System.out.println("Parental Leaves: " + parentalLeaves);
    }
}
