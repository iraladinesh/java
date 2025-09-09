package com.assignment.day6;

import java.util.Scanner;

public class CharacterRhombus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input the number: ");
        int n = in.nextInt();
        in.close();

        for (int i = 1; i <= n; i++) {
            
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            
            for (int k = i - 2; k >= 0; k--) {
                System.out.print((char)('A' + k));
            }
            System.out.println(); 
        }


        for (int i = n - 1; i >= 1; i--) {
 
            for (int spaces = 1; spaces <= n - i; spaces++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            for (int k = i - 2; k >= 0; k--) {
                System.out.print((char)('A' + k));
            }
            System.out.println();
        }
    }
}
