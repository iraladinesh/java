package com.assingment.day15.polymorphism.qsn2;

public class Bike extends Vehicle {
	
	@Override
	public void speedUp() {
		
		super.speedUp();
		System.out.println("Bike speed increased by 10 units.");
	}

}
