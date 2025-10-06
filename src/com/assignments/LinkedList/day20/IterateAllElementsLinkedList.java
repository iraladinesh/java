package com.assignments.LinkedList.day20;

import java.util.*;

public class IterateAllElementsLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList <String> colors  = new LinkedList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Pink");
		
		for(String element: colors) {
			System.out.println(element);
		}
		
		
	}

}
