package com.assignment.day4;
import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age = 0;
		System.out.printf("Enter the Age : ");
		age = sc.nextInt();
		int res = age >= 18?1:0;
		switch (res)
		{
			case 0:
				System.out.printf("You are Not Eligible to Vote");
				break;
 
			case 1:
				System.out.printf("You are Eligible to Vote.");
				break;
		}
	}
}