package com.assignments.ArrayList.day20;

import java.util.ArrayList;
import java.util.List;

public class SubListArrayList {
	
	public static void main(String[] args) {
		
		ArrayList <String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Green");
		System.out.println("Before Extracting....");
		System.out.println(colors);
		List<String> sub_list = colors.subList(0, 3);
		System.out.println("After Extracting....");
		System.out.println(sub_list);
		
	
	}
	

}
