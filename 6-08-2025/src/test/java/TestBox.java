package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import main.java.Box;

public class TestBox {

    Box box = new Box();

    @Test
    public void testareaofcircle() {
        double output = box.areaofcircle(2);
        System.out.println(output);
        double delta = 0.01;
        assertEquals(12.566370614359172, output, delta);
    }

    @Test
    public void testareaoftriangle() {
        double output = box.areaoftriangle(8, 6);
        System.out.println(output);
        assertEquals(24.0, output);
    }

    @Test
    public void testareaofsquare() {
        double output = box.areaofsquare(9);
        System.out.println(output);
        assertEquals(81.0, output);
    }

    @Test
    public void testareaofrectangle() {
        double output = box.areaofrectangle(7, 4);
        System.out.println(output);
        assertEquals(28.0, output);
    }

    @Test
    public void testsimpleinterest() {
        double output = box.simpleinterest(1500, 4, 3); 
        System.out.println(output);
        assertEquals(180.0, output);
    }

    @Test
    public void testcalculateamount() {
        double output = box.calcamount();
        System.out.println(output);
        assertEquals(1202.5, output);
    }
}
