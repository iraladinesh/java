package com.assignment.day6;

import java.util.Scanner;

public class RightAngleTriangleIncreasedNumPattern {
public static void main(String[] args) {
		
		int i, j, n, k=1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		n = sc.nextInt();
		
		for(i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(k++);
				
			}
			System.out.println("");
		}
	}

}
