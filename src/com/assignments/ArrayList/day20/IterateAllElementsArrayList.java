package com.assignments.ArrayList.day20;

import java.util.*;

public class IterateAllElementsArrayList {
	
	public static void main(String[] args) {
		
		List <String> colors  = new ArrayList<String>();
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
