package com.assignment.day6;

import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number:");
		  int n =sc.nextInt();
		  System.out.println("The first " +n+ " natural numbers are : ");
		  int sum=0;
		  for(int i=1;i<=n;i++) {
			  System.out.println(i);
			  sum=sum+i;
			  
		  }
		  System.out.println("The Sum of Natural Number upto " +n+ " terms : " +sum);
	}

}
