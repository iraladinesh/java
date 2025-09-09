package com.assignment.day6;

import java.util.Scanner;

public class IntegerCheck {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		if(n>0) {
			System.out.println(n+ " is positive number");
		}
		else if(n<0) {
			System.out.println(n+ " is negative number");
		}
		else {
			System.out.println("Number is zero");
		}
		
	}

}
