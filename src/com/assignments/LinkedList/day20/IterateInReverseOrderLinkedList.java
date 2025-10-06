package com.assignments.LinkedList.day20;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateInReverseOrderLinkedList {
	
	public static void main(String[] args) {
			
			LinkedList <String> colors  = new LinkedList<String>();
			colors.add("Red");
			colors.add("Green");
			colors.add("Blue");
			colors.add("Black");
			colors.add("Pink");
			
	        // print original list
		   System.out.println("Original linked list:" + colors);  
		   
		   Iterator it = colors.descendingIterator();
		   
		   // Print list elements in reverse order
		   System.out.println("Elements in Reverse Order:");
		   while (it.hasNext()) {
		        System.out.println(it.next());
		     }
			
			
		}

}
