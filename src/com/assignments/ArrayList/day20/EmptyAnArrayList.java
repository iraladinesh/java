package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class EmptyAnArrayList {
	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		l1.add("D");
		l1.add("E");
		
		 System.out.println("Original array list: " + l1);
		 l1.removeAll(l1);
		 System.out.println("Array list after remove all elements "+l1);
	}
	

}
