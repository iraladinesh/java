package com.assingment.day8;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveAnArrayElement {
		public static void main(String[] args) {
	     
	        int[] originalArray = {10, 20, 30, 35, 37, 29, 75, 65, 88, 4};
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Original Array: " + Arrays.toString(originalArray));
	        System.out.print("Enter the element you want to remove: ");
	        int elementToRemove = sc.nextInt();

	        int indexToRemove = -1;
	        
	        for (int i = 0; i < originalArray.length; i++) {
	            if (originalArray[i] == elementToRemove) {
	                indexToRemove = i;
	                break;
	            }
	        }

 	        if (indexToRemove != -1) {
    
 	        		int newArray[] = new int[originalArray.length - 1];
	            for (int i = 0, k = 0; i < originalArray.length; i++) {
	                 if (i != indexToRemove) {
	                    newArray[k] = originalArray[i];
	                    k++;
	                }
	            }

	            System.out.println("Element " + elementToRemove + " was removed.");
	            System.out.println("New Array: " + Arrays.toString(newArray));

	        } else {
	            System.out.println("The element " + elementToRemove + " was not found in the array.");
	            System.out.println("Array remains unchanged: " + Arrays.toString(originalArray));
	        }
	    }
	


}
