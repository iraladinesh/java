package com.assignment.day6;

import java.util.Scanner;

public class FloydsTriangle {
	
	public static void main(String[] args) {
		
		int i,j,rowNumber;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		rowNumber = sc.nextInt();
		int k=1;
		for(i=1;i<=rowNumber;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(k+ " ");
			       k++;
			}
			System.out.println("");
		}
		
	}

}
