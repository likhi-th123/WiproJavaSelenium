package project;

public class Main {
    public static void main(String[] args) {
        try {
            RegistrationManager manager = new RegistrationManager();

            // Create courses
            Course javaCourse = new Course("C101", "Java Programming");
            Course pythonCourse = new Course("C102", "Python Programming");
            manager.addCourse(javaCourse);
            manager.addCourse(pythonCourse);

            // Create student
            Student student1 = new Student("S01", "Likhith");
            manager.addStudent(student1);
            
            Student student2 = new Student("S02", "Charan");
            manager.addStudent(student2);

            // Register courses
            student1.registerCourse(javaCourse);
            student1.registerCourse(pythonCourse);
            
            student2.registerCourse(javaCourse);
            student2.registerCourse(pythonCourse);

//             student1.registerCourse(javaCourse); // Will throw CourseAlreadyRegisteredException

            // Drop a course
            student2.dropCourse("C102");

            // Try dropping a non-registered course
//             student1.dropCourse("C999"); // Will throw CourseNotFoundException

            // Display registered courses
            System.out.println("Courses registered by: " + student1.getName() +" " + "and" + " " + student2.getName() +":");
            for (Course c : student1.getRegisteredCourses()) {
                System.out.println(c.getCourseName());
            }
            for (Course c : student2.getRegisteredCourses()) {
                System.out.println(c.getCourseName());
            }

        } catch (CourseAlreadyRegisteredException | CourseNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
