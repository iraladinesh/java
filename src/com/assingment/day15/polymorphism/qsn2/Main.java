package com.assingment.day15.polymorphism.qsn2;

public class Main {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		Bike bike = new Bike();
		
		System.out.println("Car initial Speed: " +car.getSpeed());
		System.out.println("Bike initial Speed: " +bike.getSpeed());
		
		car.speedUp();
		bike.speedUp();
		
		System.out.println("Car initial Speed: " +car.getSpeed());
		System.out.println("Bike initial Speed: " +bike.getSpeed());
		
	}

}
