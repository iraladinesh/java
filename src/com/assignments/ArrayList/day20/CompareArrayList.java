package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class CompareArrayList {
	
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
		List2.add("Red");
		List2.add("White");
		List2.add("Orange");
		List2.add("Green");
		
		System.out.println("List 2 .......");
		System.out.println(List2);
		
		ArrayList<String> List3 = new ArrayList<String>();
		for(String element: List1) {
			List3.add(List2.contains(element)?"Yes":"No");
		}
		System.out.println(List3);
	}

}
