package com.assignment.day3;

import java.util.Scanner;

public class ProductOfTwoNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a =sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int product = a*b;
		System.out.println(a+ " * " +b+ " = " +product);

	}

}
