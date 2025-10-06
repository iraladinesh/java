package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class SearchAnElement {
	
	public static void main(String[] args) {
		ArrayList <String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Green");
		
		System.out.println(colors);
		
		if(colors.contains("Red")) {
			System.out.println("Element found in the array list");
		}else {
			System.out.println("Element not found");
		}
	}

}
