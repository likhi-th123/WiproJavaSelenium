package day11pgm;

public class EmloyeeProjects {
    private int projectsTaken;
    private String projectName;
    private int projectDuration;
    private String projectStatus;

    public EmloyeeProjects(int projectsTaken, String projectName, int projectDuration, String projectStatus) {
        this.projectsTaken = projectsTaken;
        this.projectName = projectName;
        this.projectDuration = projectDuration;
        this.projectStatus = projectStatus;
    }

    public void display() {
        System.out.println("Project Details ---");
        System.out.println("Projects Taken: " + projectsTaken);
        System.out.println("Project Name: " + projectName);
        System.out.println("Duration: " + projectDuration + " months");
        System.out.println("Status: " + projectStatus);
    }
}
