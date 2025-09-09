package com.assignment.day4;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the day number from 1 to 7: ");
		
		int dayNum = sc.nextInt();
		
		String weekday;
		 
		switch(dayNum) {
		
		case 1: 
			weekday = "Monday";
			break;
		case 2: 
			weekday = "Tuesday";
			break;
		case 3: 
			weekday = "Wednesday";
			break;
		case 4: 
			weekday = "Thursday";
			break;
		case 5: 
			weekday = "Friday";
			break;
		case 6: 
			weekday = "Saturday";
			break;
		case 7: 
			weekday = "Sunday";
			break;
		default: 
			weekday="Invalid Input";
			break;
			
		}
		System.out.println(weekday);
		

	}

}
