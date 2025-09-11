package com.assingment.day8;

import java.util.Arrays;

public class ReverseAnArray {
	
	

 public static void main(String[] args) {
	       
	        int[] originalArray = {10, 20, 30, 40, 50, 60, 70, 80};

	        System.out.println("Original Array: " + Arrays.toString(originalArray));

	        for (int i = 0; i < originalArray.length / 2; i++) {

	            int temp = originalArray[i];
	            originalArray[i] = originalArray[originalArray.length - 1 - i];
	            originalArray[originalArray.length - 1 - i] = temp;
	        }

	        System.out.println("Reversed Array: " + Arrays.toString(originalArray));
	    }
	


}
