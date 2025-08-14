package project;

//Custom Exceptions

class CourseNotFoundException extends Exception {
    public CourseNotFoundException(String message) {
        super(message);
    }
}