package com.assingment.day8;
import java.util.Arrays;

public class SortNumericAndStringArray {
	public static void main(String[] args) {

		        int[] numbers = {23, 3, 5, 2, 4};
		        System.out.println("Original numeric array: " + Arrays.toString(numbers));
		        Arrays.sort(numbers); 
		        System.out.println("Sorted numeric array: " + Arrays.toString(numbers));
		        String[] names = {"Rama", "Krishna", "Kumar", "Bhaskar", "Mukesh"};
		        System.out.println("Original string array: " + Arrays.toString(names));
		        Arrays.sort(names); 
		        System.out.println("Sorted string array: " + Arrays.toString(names));
		    }
		
	

}
