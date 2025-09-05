package com.assignments.day2;

import java.util.Scanner;

public class TempConversion {
	
	public double FahrenheitToCelsius(double f) {
		return  (f-32)*5/9 ;
		
	}
	
	public static void main(String[] args) {
		
		TempConversion tc = new TempConversion();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Fahrenheit:");
		double fahrenheitInpt= sc.nextDouble();
		double convertedOut = tc.FahrenheitToCelsius(fahrenheitInpt);
		
		
		System.out.println(fahrenheitInpt+ " degree Fahrenheit is equal to "+convertedOut+ " in Celsius");
		
		sc.close();
	}

}
