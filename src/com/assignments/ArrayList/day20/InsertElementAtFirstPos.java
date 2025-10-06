package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class InsertElementAtFirstPos {
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<String> ();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Violet");
		System.out.println(colors);
		
		//inserting a color(Element) as the 1st element
		
		colors.add(0, "Yellow");
		colors.add(5, "Pink");
		
		
		System.out.println(colors);
		
		
		
	}

}
