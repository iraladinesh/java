package com.assignment.day4;

import java.util.Scanner;

public class PositiveOrNegativeInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.println("Number is Positive ");
		}
		else {
			System.out.println("Number is Negative");
		}

	}

}
