package com.assignment.day6;

import java.util.Scanner;

public class InvertedTriangle {

    public static void main(String[] args) {
        
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number: ");
        number = sc.nextInt();

        for (int i = number; i >= 1; i--) {
    
            for (int j = 1; j <= number - i; j++) {
                System.out.print(" ");
            }       
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
