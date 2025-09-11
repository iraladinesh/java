package com.assingment.day8;

public class DuplicateValuesString {

	    public static void main(String[] args) {
	    	
	    	String[] my_array = {"free", "cat", "dog", "cat", "street", "stroll", "dog"};
	 
	        for (int i = 0; i < my_array.length-1; i++) {
	            for (int j = i+1; j < my_array.length; j++) {
	                if ((my_array[i] == my_array[j]) && (i != j)) {
	                    System.out.println("Duplicate Element : " + my_array[j]);
	                }
	            }
	        }
	      
	}


}
