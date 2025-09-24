package com.assingment.day15.polymorphism.qsn2;

public class Car extends Vehicle {
	
	@Override
    public void speedUp() {
			super.speedUp();
        System.out.println("Car speed increased by 22 units.");
	}

}
