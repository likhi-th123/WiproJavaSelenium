package project;

import java.util.ArrayList;

public class Student extends Person implements Registrable {
    private ArrayList<Course> registeredCourses;

    public Student(String id, String name) {
        super(id, name);
        this.registeredCourses = new ArrayList<>();
    }

    @Override
    public void registerCourse(Course course) throws CourseAlreadyRegisteredException {
        if (registeredCourses.contains(course)) {
            throw new CourseAlreadyRegisteredException("Course already registered: " + course.getCourseName());
        }
        registeredCourses.add(course);
    }

    @Override
    public void dropCourse(String courseId) throws CourseNotFoundException {
        Course toRemove = null;
        for (Course c : registeredCourses) {
            if (c.getCourseId().equals(courseId)) {
                toRemove = c;
                break;
            }
        }
        if (toRemove == null) {
            throw new CourseNotFoundException("Course not found: " + courseId);
        }
        registeredCourses.remove(toRemove);
    }

    public ArrayList<Course> getRegisteredCourses() {
        return registeredCourses;
    }
}
