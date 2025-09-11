package com.assingment.day8;

import java.util.Arrays;

public class FindMinMax {
		public static void main(String[] args) {
	       
	        int[] numbers = {45, 12, 67, 89, 3, 55, 99, 21, 10};
	        int max = numbers[0];
	        int min = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {

	            if (numbers[i] > max) {
	                max = numbers[i];
	            }

	            if (numbers[i] < min) {
	                min = numbers[i];
	            }
	        }


	        System.out.println("Original Array: " + Arrays.toString(numbers));

	        System.out.println("Maximum value: " + max);
	        System.out.println("Minimum value: " + min);
	    }
	


}
