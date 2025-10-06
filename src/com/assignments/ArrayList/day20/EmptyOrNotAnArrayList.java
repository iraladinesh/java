package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class EmptyOrNotAnArrayList {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		
	     System.out.println("Original array list: " + l1);
		 System.out.println("Checking whether the list is empty or not: " + l1.isEmpty());
		 l1.removeAll(l1);
		 System.out.println("Array list after removing all elements "+l1);
		 System.out.println("Checking whether the list is empty or not: "+l1.isEmpty());
	}
	

}
