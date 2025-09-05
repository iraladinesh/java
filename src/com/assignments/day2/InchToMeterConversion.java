package com.assignments.day2;

import java.util.Scanner;

public class InchToMeterConversion {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter how many inches:");
		 double inches = sc.nextDouble();
		 
		 double meters = inches * 0.0254;
		  
		 System.out.println(inches+ " inch is "+meters+ "meters");
		 sc.close();

	}

}
