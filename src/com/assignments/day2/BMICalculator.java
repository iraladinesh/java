package com.assignments.day2;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

    	  Scanner sc = new Scanner(System.in);

          System.out.println("Enter weight in pounds: ");
          double weightInPounds = sc.nextDouble();
          System.out.println("Enter height in inches: ");
          double heightInInches = sc.nextDouble();
          double BMI = (weightInPounds * 0.45359237 / (heightInInches * 0.0254 * heightInInches * 0.0254));
          System.out.println("Body Mass Index is " + BMI);
          
          sc.close();
    }
}
