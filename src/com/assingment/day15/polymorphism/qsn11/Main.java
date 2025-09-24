package com.assingment.day15.polymorphism.qsn11;


public class Main {
	public static void main(String[] args) {
		Vehicle car = new Car();
		Vehicle motorcycle = new Motorcycle();

		startAndStopEngine(car);
		startAndStopEngine(motorcycle);
}

	public static void startAndStopEngine(Vehicle vehicle) {
		vehicle.startEngine();
		vehicle.stopEngine();
}
} 

