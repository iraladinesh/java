package com.assignment.day3;

import java.util.Scanner;

public class AreaAndPerimeterOfRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the rectangle");
		double l = sc.nextDouble();
		System.out.println("Enter width of the rectangle");
		double w = sc.nextDouble();
		double a = l*w;
		double p = 2*(l+w);
		
		System.out.printf("Area is %.1f * %.1f = %.2f \n",l,w, a);
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", l, w, p);
		
		

	}

}
