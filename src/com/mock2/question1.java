package com.mock2;

import java.util.*;

public class question1 {
	public static void main(String[] args) {
		
	
	//duplicate characters from string;
	
	String str = "testjava";
	
	StringBuilder res = new StringBuilder();
	
	LinkedHashSet<Character> set = new LinkedHashSet<>();
	for(char c: str.toCharArray()) {
		set.add(c);
	}
	
	for(char c: set) {
		res.append(c);
		
	}
	System.out.println("Original String: "+str);
	
	System.out.println("Without Duplicates String: "+res);
	
	}

}
