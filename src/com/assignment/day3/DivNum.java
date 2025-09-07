package com.assignment.day3;

import java.util.Scanner;

public class DivNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for dividend");
		int a = sc.nextInt();
		System.out.println("Enter the number for divisor");
		int b = sc.nextInt();
		int div = a/b;
		System.out.println(div);
		

	}

}
