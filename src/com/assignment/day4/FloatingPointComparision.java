package com.assignment.day4;

import java.util.Scanner;

public class FloatingPointComparision {

	public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter floating-point number: ");
        double x = sc.nextDouble();
        System.out.print("Enter floating-point another number: ");
        double y = sc.nextDouble();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
