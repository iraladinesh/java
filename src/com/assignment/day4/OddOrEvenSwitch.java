package com.assignment.day4;


import java.util.Scanner;

public class OddOrEvenSwitch {

	public static void main(String[] args) {
	
		    Scanner SN = new Scanner(System.in);

		    int number = 0;

		    System.out.printf("Enter a positive integer number: ");
		    number = SN.nextInt();

		    switch (number % 2) {
		    case 0:
		      System.out.printf("%d is an even number", number);
		      break;

		    case 1:
		      System.out.printf("%d is an odd number", number);
		      break;
		    }

		  }
		

	

}
