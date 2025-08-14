package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import main.java.EmployeeOperations;

public class TestEmployeeData {

	EmployeeOperations emp = new EmployeeOperations();

    @BeforeEach
    public void setUp() {
        emp = new EmployeeOperations();
        System.out.println("Test Started");
    }

    @Test
    public void testInsertEmployee() {
        int result = emp.insertEmployee(1001, "likhi", "HR");
        System.out.println("Insert Result: " + result);
        assertEquals(1, result);
    }

    @Test
    public void testUpdateEmployee() {
        emp.insertEmployee(1002, "charan", "IT");
        int result = emp.updateEmployee(1002, "rohit");
        System.out.println("Update Result: " + result);
        assertEquals(1, result);

    }

    @Test
    public void testDeleteEmployee() {
        emp.insertEmployee(1003, "virat", "Sales");
        int result = emp.deleteEmployee(1003);
        System.out.println("Delete Result: " + result);
        assertEquals(1, result);
    }
}
