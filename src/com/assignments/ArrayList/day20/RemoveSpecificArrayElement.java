package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class RemoveSpecificArrayElement {
	
	public static void main(String[] args) {
		
		ArrayList <String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Green");
		
		System.out.println(colors);
		//Removing the element at index 3
		colors.remove(2);
		System.out.println(colors);
		
	}

}
