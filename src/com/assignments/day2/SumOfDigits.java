package com.assignments.day2;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		System.out.println("Enter the number to add the digits:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if(n<0||n>1000) {
			System.out.println("Invalid Number");
		}
		
		if(n == 0) {
			int sum=0;
		}
		
		int sum=0;
		int tempNumber=n;
		
		while(tempNumber!=0) {
			int lastdig = tempNumber%10;
			sum += lastdig;
			tempNumber=tempNumber/10;
			
	    }
		System.out.println("The sum of all digits in " +n+ " is " +sum);
			
		
        sc.close();
	}

}
