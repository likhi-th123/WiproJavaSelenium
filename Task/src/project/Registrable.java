package project;

public interface Registrable {
	 void registerCourse(Course course) throws CourseAlreadyRegisteredException;
	 void dropCourse(String courseId) throws CourseNotFoundException;

}
