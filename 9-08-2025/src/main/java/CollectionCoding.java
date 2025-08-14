package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
public class CollectionCoding {
	
	
	//shuffleelement
	 public String shuffleElement(String str) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Mango");
	        list.add("Banana");
	        list.add("Grapes");
	        list.add("Orange");

	        System.out.println("Original List: " + list);
	        Collections.shuffle(list);
	        return list.toString();
	    }
	 

    // Extract a portion of an ArrayList
	 public List<String> extractPortion() {
		    ArrayList<String> list = new ArrayList<>(Arrays.asList("likhith", "charan", "rohit", "rocky", "yash", "ram"));
		    return list.subList(2, 4); 
		}


//	 //replacement
	 public String replacement(String ele) {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        System.out.println("Original List: " + list);

	        if (list.size() >= 2) {
	            list.set(1, ele);
	        }
	        return list.toString();
	    }
	 
    // Clone a HashSet
    public void cloning() {
        HashSet<String> originalOne = new HashSet<>(Arrays.asList("Great Wall of China", "Christ the Redeemer", "Petra", "Colosseum"));
        HashSet<String> cloneOne = new HashSet<>(originalOne);
        System.out.println("Original HashSet: " + originalOne);
        System.out.println("Cloned HashSet: " + cloneOne);
    }

    // Convert HashSet to TreeSet
    public void hashToTree() {
        HashSet<String> hash = new HashSet<>(Arrays.asList("Quasar", "Pulsar", "Galaxy", "Supernova", "Asteroid", "Comet"));
        TreeSet<String> tree = new TreeSet<>(hash);
        System.out.println("HashSet: " + hash);
        System.out.println("TreeSet (Sorted): " + tree);
    }
}
	
	

	 
	


