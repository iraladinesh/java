package com.assignment.day3;

import java.util.Scanner;

public class AvgOfNum {

	public static void main(String[] args) {
		double sum = 0;
		double count = 1;
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number to calculate the average: ");
		  int n = sc.nextInt();
		  while (count <= n) {
		   System.out.println("Enter the number " + "(" + (int) count + ")" + ":");
		   sum += sc.nextInt();
		   count += 1;
		  }
		  double avg = (sum / n);
		  System.out.println("Average: " + avg);

	}

}
