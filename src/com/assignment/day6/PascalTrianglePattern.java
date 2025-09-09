package com.assignment.day6;

import java.util.Scanner;

public class PascalTrianglePattern {
	public static void main(String[] args) {
		
		int numOfRows, i, j, currentVal=1, spacesCount;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of the rows: ");
		numOfRows=sc.nextInt();
		
		for(i=0;i<numOfRows;i++) {
			for(spacesCount=1;spacesCount<=numOfRows-i;spacesCount++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				
				if(j==0||i==0) {
					currentVal=1;
				}
				else {
					currentVal = currentVal * (i-j+1)/j;
				}
				System.out.print(" " + currentVal);
			}
			System.out.println();	
		}
		
		
	}

}
