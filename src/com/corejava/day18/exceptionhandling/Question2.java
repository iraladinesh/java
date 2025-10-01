package com.corejava.day18.exceptionhandling;

public class Question2 {
	//Exception for Odd Number
	public static void main(String[] args) {
		int n=16;
		trynumber(n);
		n =5;
		trynumber(n);
	}

	public static void trynumber(int n) {
		try {
			checkEvenNumber(n);
			System.out.println(n+ " is even number");
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " +e.getMessage());
		}
		
	}

	public static void checkEvenNumber(int number) {
		if(number % 2 != 0) {
			throw new IllegalArgumentException(number+ " is odd");
		}
		
	}

}
