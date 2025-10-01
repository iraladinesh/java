package com.corejava.day18.exceptionhandling;

public class Question1 {
	//exception handling
	public static void main(String[] args) {
		
		try {
			int result = divideNumbers(5,0);
			System.out.println("Result: " + result);	
		}
		catch(ArithmeticException e) {
			System.out.println("Error: " +e.getMessage());
		}
	}

	public static int divideNumbers(int dividend, int divisior) {
		if(divisior==0) {
			throw new ArithmeticException("cannot divide the number with zero");
			
		}
		return dividend/divisior;
	}

}
