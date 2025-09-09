package com.assignment.day6;

import java.util.Scanner;

public class CubeOfNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));
		}
	}

}
