package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import main.java.CodingQuestions;

public class TestCoding {
	
	CodingQuestions cd = new CodingQuestions();
	
	//1
	@Test
	public void testreversetable() {
		int output = cd.ReverseTable(5);
		System.out.println(output);
		assertEquals(5,output);
	}
	
	//2
	 @Test
	 public void testGetAlphabet() {
		 char input = ' ';
	     char output = cd.getAlphabet(input);
	     System.out.println(output);
	     assertEquals(input, output);
	 }
	 
	 //3
	 @Test
	 public void testasciivalue() {
		 String input = " ";
		 String output = cd.asciiValue(input);
		 assertEquals(input, output);
		 
	 }
	 
	 //4
	 @Test
	 public void testFactorial() {
		 
		 int output=cd.factorial(5);
		 System.out.println("Factorial of 5 is:" + output);
		 assertEquals(120, output);
		 
	 }
	 
	 //5
	 @Test
	 public void testCountNumbers() {
	     int[] input = {5, -3, 0, 7, 1, 0, 2}; // 4 positives, 1 negative, 2 zeros
	     String expected = "4 1 2";
	     String actual = cd.countnumbers(input);
	     assertEquals(expected, actual);
	 }
	 
	 
	 //6
	 @Test
	 public void testmaxmin() {
		 int[] input = {1, 2, 3, 4, 5, 6, 8};
	     String expected = "8 1";
	     String actual = cd.findminmax(input);
	     System.out.println(actual);
	     assertEquals(expected, actual);
	    }
	 
	 
	 //7
	 @Test
	 public void testDivisibleBy() {
	     String output = cd.divisibleby();
	     System.out.println(output);
	     assertEquals("Count: 11, Sum: 1683", output);
	 }
	 
	 
	 //8
	 @Test
	    public void testOnesComplement() {
		 int output = cd.onescompliment(2);
		 System.out.println(output);
		 assertEquals(-3, output);
	 }
	 
	 
	 //9
	 @Test
	 public void testTwosComplement() {
		 int output = cd.twosComplement(2);
		 System.out.println(output);
		 assertEquals(-2, output);
		 
	 }
	 
	 
	 //10
	 @Test
	 public void testFibonacciSeries() {
	     int output = cd.fibonacciSeries(5);
	     assertEquals(5, output);
	     System.out.println();
	 }


}
