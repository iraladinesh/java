package com.assignment.day3;

import java.util.Scanner;

public class TableMultiplication {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table number");
		
		int a = sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(a+" * " +i+ " = " +(a*i));
		}
	}

}
