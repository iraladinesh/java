package com.assingment.day8;

import java.util.Scanner;

public class FindArrayIndex {
	
		public static void main(String[] args) {
	        
	        int[] numbers = {10, 25, 30, 45, 50, 65, 70, 85, 90, 100};
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number you want to find in the array: ");
	        int elementToFind = scanner.nextInt();
	        int foundIndex = -1;
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] == elementToFind) {
	                foundIndex = i;
	                break; 
	            }
	        }
	        
	        if (foundIndex != -1) {
	            System.out.println("The element " + elementToFind + " was found at index: " + foundIndex);
	        } else {
	            System.out.println("The element " + elementToFind + " was not found in the array.");
	        }
	    }
	


}
