package com.assignment.day4;

import java.util.Scanner;

public class GenderChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char gender;
		
		System.out.println("Enter the gender M/F of m/f");
		
		gender = sc.next().charAt(0);
		
		switch(gender){
		
			case 'M':
			case 'm':
			System.out.println("Male");
			break;
			
			case 'F':
			case 'f':
			System.out.println("Female");
			break;
			
			default: 
			 System.out.println("Invalid Character");
			
		}

	}

}
