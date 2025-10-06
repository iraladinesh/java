package com.assignments.ArrayList.day20;

import java.util.ArrayList;

public class PrintElementsByPosition {
	public static void main(String[] args) {
		
		ArrayList<String> c1 = new ArrayList<>();
		c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original Array: " +c1);
        int arraySize = c1.size();
        for(int i =0;i<arraySize;i++) {
        		System.out.println(c1.get(i));
        	
        }

		
	}

}
