package com.assingment.day8;

import java.util.*;

public class FindCommonElements {

	    public static void main(String[] args) {
	    	
	    		int[] array1 = {1, 2, 5,  8, 7, 9, 10};
	        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};


	        System.out.println("Array1 : " + Arrays.toString(array1));
	        System.out.println("Array2 : " + Arrays.toString(array2));
	        
	        for (int i = 0; i < array1.length; i++) {
	            for (int j = 0; j < array2.length; j++) {
	                if (array1[i]==(array2[j])) {
		                    System.out.println(array1[i]);
	                }
	            }
	        }


	    
	    }


}
