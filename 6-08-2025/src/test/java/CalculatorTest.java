package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import main.java.Calculator;
public class CalculatorTest {
	Calculator calc = new Calculator();
	
	@Test
	public void testadd() {
		assertEquals(70,calc.add(66, 4));
	}
	
	@Test
	public void testsub() {
		assertEquals(20, calc.sub(50, 30));
	}
	
	@Test
	public void testmul() {
		assertEquals(50, calc.mul(10, 5));
	}
	
	@Test
	public void testdiv() {
		assertEquals(25,calc.div(100, 4));
	}

}
