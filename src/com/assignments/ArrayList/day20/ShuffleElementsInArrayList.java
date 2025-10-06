package com.assignments.ArrayList.day20;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleElementsInArrayList {
	
	public static void main(String[] args) {
		ArrayList <String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("White");
		colors.add("Blue");
		colors.add("Orange");
		colors.add("Green");
		System.out.println("Before Shuffling the Array Elements");
		System.out.println(colors);
		Collections.shuffle(colors);
		System.out.println("After Shuffling the Array Elements");
		System.out.println(colors);
		
	}

}
