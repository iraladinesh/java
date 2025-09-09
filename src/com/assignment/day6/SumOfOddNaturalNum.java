package com.assignment.day6;

import java.util.Scanner;

public class SumOfOddNaturalNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of terms:");
		  int n =sc.nextInt();
		  System.out.println("The odd numbers are :");
		  int sum=0;
		  for(int i=1;i<=n;i++) {
			  System.out.println (2*i-1);
			     sum+=2*i-1;
			  }
		
		  System.out.println("The Sum of odd Natural Number upto " +n+ " terms : " +sum);
	}

}
