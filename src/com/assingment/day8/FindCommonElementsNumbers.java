package com.assingment.day8;

import java.util.*;

public class FindCommonElementsNumbers {

	    public static void main(String[] args) {
	    	
	        String[] array1 = {"Lion", "Tiger", "Suresh", "Shyam", "Stuart", "Larry"};
	        String[] array2 = {"Zack", "Mack", "Zren", "Larry", "Stuart", "vin", "Will"};


	        System.out.println("Array1 : " + Arrays.toString(array1));
	        System.out.println("Array2 : " + Arrays.toString(array2));


	        HashSet set = new HashSet();


	        for (int i = 0; i < array1.length; i++) {
	            for (int j = 0; j < array2.length; j++) {
	                if (array1[i].equals(array2[j])) {
		                    set.add(array1[i]);
	                }
	            }
	        }

	        System.out.println("Common element : " + (set)); 
	    }
	


}
