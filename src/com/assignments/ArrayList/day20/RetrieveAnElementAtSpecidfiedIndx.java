package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class RetrieveAnElementAtSpecidfiedIndx {
	
	public static void main(String[] args) {
		
ArrayList<String> colors = new ArrayList<String> ();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Violet");
		System.out.println(colors);
		
		//Retrieve element based on the index
		
		//first index
		String element = colors.get(1);
		System.out.println(element);
		//fourth index
		element = colors.get(4);
		System.out.println(element);
				
	}

}
