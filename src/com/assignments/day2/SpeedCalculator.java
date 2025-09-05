package com.assignments.day2;

import java.util.Scanner;

public class SpeedCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in meters: ");
		double distanceInMeters = sc.nextDouble();
		
		
		System.out.println("Enter the hours: ");
		int hours = sc.nextInt();
		System.out.println("Enter the minutes");
		int minutes = sc.nextInt();
		System.out.println("Enter the seconds");
		int seconds = sc.nextInt();
		
		double totalTimeInSeconds = (hours*3600)+ (minutes*60) +seconds;
		double speedMetersPerSecond = distanceInMeters/totalTimeInSeconds;
		double speedKilometersPerHour = ((distanceInMeters/1000.0) / (totalTimeInSeconds/3600.0));
		double speedMilesPerHour = ((distanceInMeters/1609.0) / (totalTimeInSeconds/3600.025));
		
		System.out.println("Speed in meters per second: " + speedMetersPerSecond + " m/s");
        System.out.println("Speed in kilometers per hour: " + speedKilometersPerHour + " km/h");
        System.out.println("Speed in miles per hour: " + speedMilesPerHour + " mph");
        
        sc.close();

	}

}
