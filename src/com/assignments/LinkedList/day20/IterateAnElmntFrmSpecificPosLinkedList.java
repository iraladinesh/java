package com.assignments.LinkedList.day20;

import java.util.*;


public class IterateAnElmntFrmSpecificPosLinkedList {
	
	public static void main(String[] args) {
		
		LinkedList <String> colors  = new LinkedList<String>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Black");
		colors.add("Pink");
		
		Iterator p = colors.listIterator(1);

	   // print list from second position
	   while (p.hasNext()) {
	   System.out.println(p.next());
	   }
		
		
	}

}
