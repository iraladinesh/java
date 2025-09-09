package com.assignment.day4;

import java.util.Scanner;

public class NumberOfdaysInMonth {

	public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        int numOfDaysInMonth = 0; 
        String MonthName = "Unknown";

        System.out.print("Enter the month number: ");
        int month = input.nextInt();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        switch (month) {
            case 1:
                MonthName = "January";
                numOfDaysInMonth = 31;
                break;
            case 2:
                MonthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numOfDaysInMonth = 29;
                } else {
                    numOfDaysInMonth = 28;
                }
                break;
            case 3:
                MonthName = "March";
                numOfDaysInMonth = 31;
                break;
            case 4:
                MonthName = "April";
                numOfDaysInMonth = 30;
                break;
            case 5:
                MonthName = "May";
                numOfDaysInMonth = 31;
                break;
            case 6:
                MonthName = "June";
                numOfDaysInMonth = 30;
                break;
            case 7:
                MonthName = "July";
                numOfDaysInMonth = 31;
                break;
            case 8:
                MonthName = "August";
                numOfDaysInMonth = 31;
                break;
            case 9:
                MonthName = "September";
                numOfDaysInMonth = 30;
                break;
            case 10:
                MonthName = "October";
                numOfDaysInMonth = 31;
                break;
            case 11:
                MonthName = "November";
                numOfDaysInMonth = 30;
                break;
            case 12:
                MonthName = "December";
                numOfDaysInMonth = 31;
        }
        System.out.print(MonthName + " " + year + " has " + numOfDaysInMonth + " days\n");
    }
}


