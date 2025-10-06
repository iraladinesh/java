package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class TrimArrayList {
	
	public static void main(String[] args) {
		
		ArrayList <String> colors = new ArrayList<>(10);
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Green");
		System.out.println(colors);
		System.out.println("Before trimming the size is " +colors.size());
		//removing green color
		colors.remove("Green");
		System.out.println(colors);
		colors.trimToSize();
		System.out.println("After trimming the size is "+colors.size());
		
		
	}

}
