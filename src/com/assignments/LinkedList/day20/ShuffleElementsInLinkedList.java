package com.assignments.LinkedList.day20;

import java.util.Collections;
import java.util.LinkedList;

public class ShuffleElementsInLinkedList {
	
	public static void main(String[] args) {
		LinkedList <String> colors = new LinkedList<>();
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
