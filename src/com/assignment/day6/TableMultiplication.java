package com.assignment.day6;

import java.util.Scanner;

public class TableMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number to calculate: ");
		int num1 = sc.nextInt();
		System.out.println("Input the number of the terms: ");
		int num2 = sc.nextInt();
		int product;
		
		for(int i=0;i<=num2;i++) {
			
			System.out.println(num1+ " x " +i+ " = " +num1*i);
		}
	}

}
