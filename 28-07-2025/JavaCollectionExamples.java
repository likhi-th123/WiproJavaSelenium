package assessment;

import java.util.*;

public class JavaCollectionExamples {
    public static void main(String[] args) {

        // Convert Collection to Array

    	List<String> fruits = new ArrayList<>();
    	fruits.add("Apple");
    	fruits.add("Banana");
    	fruits.add("Cherry");

    	System.out.println("Collection to Array:");
    	for (int i = 0; i < fruits.size(); i++) {
    	    System.out.println(fruits.get(i));
    	}
    	
    	//shuffle element
    	ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");

        System.out.println("Before shuffle: " + list);
        Collections.shuffle(list);
        System.out.println("After shuffle: " + list);


        // Find a sublist in the List
        List<String> letters = Arrays.asList("A", "B", "C", "D", "E");
        List<String> sub = letters.subList(1, 4); // from index 1 to index 3
        System.out.println("\nSublist: " + sub);

        // Iterate through elements of HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("\nIterating HashMap:");
        for (Integer key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }
}
