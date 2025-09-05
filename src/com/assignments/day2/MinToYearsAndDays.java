package com.assignments.day2;

import java.util.Scanner;

public class MinToYearsAndDays {

	public static void main(String[] args) {
		
		System.out.println("Enter total minutes:");
		Scanner sc = new Scanner(System.in);
		
		long minutes = sc.nextLong();
		long days = minutes/(60*24);
		long years = days/365;
		long remainingdays = days%365;
		
		System.out.println(minutes+ " minutes is approximately " +years+ " years and "+remainingdays+ " days");
		
		sc.close();
	}

}
