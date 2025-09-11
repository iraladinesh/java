package com.assingment.day8;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAnElement {
		public static void main(String[] args) {
	        
	        int[] originalArray = {10, 20, 30, 40, 50};

	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Original Array: " + Arrays.toString(originalArray));

	        
	        System.out.print("Enter the element you want to insert: ");
	        int elementToInsert = scanner.nextInt();

	        
	        System.out.print("Enter the index (position) to insert at (0 to " + originalArray.length + "): ");
	        int insertIndex = scanner.nextInt();

	        if (insertIndex >= 0 && insertIndex <= originalArray.length) {
	            int[] newArray = new int[originalArray.length + 1];

	            for (int i = 0, k = 0; i < newArray.length; i++) {

	                if (i == insertIndex) {
	                    newArray[i] = elementToInsert;
	                } else {

	                    newArray[i] = originalArray[k];
	                    k++;
	                }
	            }

	            System.out.println("Element " + elementToInsert + " inserted at index " + insertIndex + ".");
	            System.out.println("New Array: " + Arrays.toString(newArray));

	        } else {

	            System.out.println("Invalid index. The element could not be inserted.");
	            System.out.println("Array remains unchanged: " + Arrays.toString(originalArray));
	        }
	    }
	


}
