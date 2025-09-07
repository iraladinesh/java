package com.assignment.day3;

import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		 double r = sc.nextDouble();
		 double perimeter = 2*r*Math.PI;
		 double area = Math.PI*r*r;
		 System.out.println("Perimeter is = "+perimeter);
		 System.out.println("Area is = "+area);
		 
		 
		

	}

}
