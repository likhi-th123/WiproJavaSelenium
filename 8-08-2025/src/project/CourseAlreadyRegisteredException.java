package project;


//Custom Exceptions

public class CourseAlreadyRegisteredException extends Exception {
    public CourseAlreadyRegisteredException(String message) {
        super(message);
    }
}
