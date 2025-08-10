package test.java;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import main.java.CollectionCoding;

public class TestCollection {
	
	CollectionCoding cc = new CollectionCoding();
	
	@Test
    public void testShuffleElement() {
        String result = cc.shuffleElement(" ");
        System.out.println("Shuffled output: " + result);
    }
	
	@Test
	public void testExtractPortion() {
	    List<String> result = cc.extractPortion();
	    assertEquals(List.of("rohit", "rocky"), result);
	}
	
	@Test
	public void testReplacement() {
		String result = cc.replacement("Mango");
		System.out.println("replacement list is: " +result);
		assertEquals("[Apple, Mango, Cherry]", result);
	    }
	

}
