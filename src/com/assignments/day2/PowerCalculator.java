package com.assignments.day2;

import java.util.Scanner;

public class PowerCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the number: ");
		
		double num = sc.nextDouble();

		
		System.out.printf("Square: %.2f\n", num * num);
		System.out.printf("Cube: %.2f\n", num * num *num);
		System.out.printf("Cube: %.2f\n", num * num *num* num);
		
		sc.close();

	}

}
