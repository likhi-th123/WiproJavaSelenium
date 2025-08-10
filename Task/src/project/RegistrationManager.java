package project;

import java.util.ArrayList;

public class RegistrationManager {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public RegistrationManager() {
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Student findStudent(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) return s;
        }
        return null;
    }

    public Course findCourse(String id) {
        for (Course c : courses) {
            if (c.getCourseId().equals(id)) return c;
        }
        return null;
    }
}
