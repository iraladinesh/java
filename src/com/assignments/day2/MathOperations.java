package com.assignments.day2;

import java.util.Scanner;
public class MathOperations {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd integer: ");
        int num2 = sc.nextInt();

        System.out.printf("Sum of two integers: %d%n", num1 + num2);
        System.out.printf("Difference of two integers: %d%n", num1 - num2);
        System.out.printf("Product of two integers: %d%n", num1 * num2);
        System.out.printf("Average of two integers: %.2f%n", (double) (num1 + num2) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(num1 - num2));
        System.out.printf("Max integer: %d%n", Math.max(num1, num2));
        System.out.printf("Min integer: %d%n", Math.min(num1, num2));
        
        sc.close();
    }
}
