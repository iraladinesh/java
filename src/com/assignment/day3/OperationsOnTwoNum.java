package com.assignment.day3;

import java.util.Scanner;

public class OperationsOnTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a =sc.nextInt();
		System.out.println("Enter the second number: ");
		int b = sc.nextInt();
		int sum = a+b;
		int sub =a-b;
		int product = a*b;
		int div = a/b;
		int mod = a%b;
		
		System.out.println(a+ " + " +b+ " = " +sum);
		System.out.println(a+ " - " +b+ " = " +sub);
		System.out.println(a+ " * " +b+ " = " +product);
		System.out.println(a+ " / " +b+ " = " +div);
		System.out.println(a+ " mod " +b+ " = " +mod);
		

	}

}
