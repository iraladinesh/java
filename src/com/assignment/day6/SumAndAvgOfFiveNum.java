package com.assignment.day6;

import java.util.Scanner;

public class SumAndAvgOfFiveNum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		int sum=0;
		double avg;
		for(int i=1;i<=5;i++) {
			System.out.println("Enter " +i+ " Number");
			int a = sc.nextInt();
			sum = sum+a;
		}
		System.out.println("The sum of 5 no is : "+sum);
		avg = sum/n;
		System.out.println("The Average is : " +avg);
	}

}
