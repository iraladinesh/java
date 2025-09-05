package com.assignments.day2;

public class SignUnsignedComparision {

	public static void main(String[] args) {
		
		int num1 = Integer.MIN_VALUE;
		int num2 = Integer.MAX_VALUE;
		System.out.println("Integers are: " + num1 + ", " + num2);
		
		int compare_Signed_num = Integer.compare(num1, num2);
		
		System.out.println("Result of comparing signed numbers: " + compare_Signed_num);
		
		int compare_Unsigned_num = Integer.compareUnsigned(num1, num2);
		
        System.out.println("Result of comparing unsigned numbers: " + compare_Unsigned_num);
        

	}

}
