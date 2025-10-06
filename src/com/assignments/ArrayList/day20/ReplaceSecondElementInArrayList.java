package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class ReplaceSecondElementInArrayList {
	
	    public static void main(String[] args) {
	        // Create an ArrayList of strings
	        ArrayList<String> fruits = new ArrayList<>();
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Orange");
	        fruits.add("Grapes");

	        // Print the original list
	        System.out.println("Original ArrayList: " + fruits);

	        // Define the new element
	        String newElement = "Kiwi";

	        // Replace the second element (at index 1) with the new element
	        // The set() method returns the element that was replaced.
	        String oldElement = fruits.set(1, newElement);

	        // Print the updated list
	        System.out.println("Updated ArrayList: " + fruits);
	        System.out.println("Replaced element: " + oldElement);
	    }
	


}
