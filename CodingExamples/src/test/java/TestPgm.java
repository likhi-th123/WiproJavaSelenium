package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

import main.java.CodingEx;

public class TestPgm {
	CodingEx ex = new CodingEx();
	
	@Test
	public void testtwostring() {
		String output = ex.concatenate("Hello", "World");
		System.out.println("Concatenate of two Strings: " + output);
	    assertEquals("HelloWorld",output);
	}
	
	@Test
	public void testremovespace() {
		String output = ex.removespace("Hello Likhith");
		System.out.println("Removing spaces in two Strings: " + output);
		assertEquals("HelloLikhith", output);
	}
	
	@Test
	public void testcountCharacters() {
		String output = ex.countCharacters("ab12@$ca423sdfg");
		System.out.println("Counting the number of letters, digits and special character: " + output);
		assertEquals("8 5 2", output);
	}
	
	@Test
    public void testreplaceFirstVowel() {
        String output = ex.replaceFirstVowel("hello");
        System.out.println("Replace with first Vowel Leter: " + output);
        assertEquals("h-llo", output);
    }
	
	@Test
	public void testhighestFrequencyChar() {
		char output = ex.highestFrequencyChar("likhith");
		System.out.println("highest Frequency Character is: " +output);
		
	}

}
