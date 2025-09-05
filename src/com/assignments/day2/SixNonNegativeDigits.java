package com.assignments.day2;

import java.util.Scanner;

public class SixNonNegativeDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Six Digit number");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("Invalid Number");
			
		}
		
		int num1 = num / 100000 % 10;
        int num2 = num / 10000 % 10;
        int num3 = num / 1000 % 10;
        int num4 = num / 100 % 10;
        int num5 = num / 10 % 10;
        int num6 = num % 10;
        
        System.out.println(num1+ " " +num2+ " " +num3+ " " +num4+ " " +num5+ " " +num6);
		
        sc.close();

	}

}
