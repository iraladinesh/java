package com.assignment.day4;

import java.util.Scanner;

public class QuadraticEqnRoots {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number a:");
		double a = sc.nextDouble();
		System.out.println("Enter the number b:");
		double b = sc.nextDouble();
		System.out.println("Enter the number c:");
		double c = sc.nextDouble();
		
		double res = b*b - 4.0*a*c; 
		
		
		if(res>0.0) {
			
			double d1= (-b+ Math.pow(res, 0.5)) / (2.0*a);
			double d2= (-b- Math.pow(res, 0.5)) / (2.0*a);
			System.out.println("The roots are " + d1 + " and " + d2);
		}
		else if(res<0.0){
			
			double x= -b/(2.0*a);
			System.out.println("The root is : " +x);
			
		}
		else {
			System.out.println(" No real roots for the eqn");
		}
	}

}
