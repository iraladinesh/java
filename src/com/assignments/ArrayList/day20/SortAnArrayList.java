package com.assignments.ArrayList.day20;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {
	
	public static void main(String[] args) {
		ArrayList <String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Green");
		
		System.out.println("Before the Sort:");
		System.out.println(colors);
		Collections.sort(colors);
		System.out.println("After the Sort:");
		System.out.println(colors);
		
		
	}

}
