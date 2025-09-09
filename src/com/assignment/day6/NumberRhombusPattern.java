package com.assignment.day6;

import java.util.Scanner;

public class NumberRhombusPattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = in.nextInt();
        in.close();

        for (int i = 1; i <= n; i++) {
           
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
           
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println(); 
        }

        for (int i = n - 1; i >= 1; i--) {
            
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
           
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println(); 
        }
    }
}
