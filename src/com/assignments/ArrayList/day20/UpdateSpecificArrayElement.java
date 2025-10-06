package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class UpdateSpecificArrayElement {
	
	public static void main(String[] args) {
		
		ArrayList <String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Green");
		
		System.out.println(colors);
		//updating the element at index 0
		
		colors.set(0, "Yellow");
		System.out.println(colors);
		
	}

}
