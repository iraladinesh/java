package com.assignments.ArrayList.day20;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
	
	public static void main(String[] args) {
		ArrayList <String> List1 = new ArrayList<>();
		List1.add("Red");
		List1.add("White");
		List1.add("Blue");
		List1.add("Orange");
		List1.add("Green");
		
		System.out.println("List 1 .......");
		System.out.println(List1);
		
		ArrayList <String> List2 = new ArrayList<>();
		List2.add("A");
		List2.add("B");
		List2.add("C");
		List2.add("D");
		List2.add("E");
		
		System.out.println("List 2 .......");
		System.out.println(List2);
		
		Collections.copy(List1, List2);
		System.out.println("After copying.......");
		System.out.println("List 1 .......");
		System.out.println(List1);
		System.out.println("List 2 .......");
		System.out.println(List2);

	
		
		
	}

}
