package com.assingment.day15.polymorphism.qsn1;

public class Main {
	
	public static void main(String[] args) {
		
		
		Animal ani = new Animal();
		
		Bird bird = new Bird();
		
		Cat cat = new Cat();
		
		ani.makeSound();
		bird.makeSound();
		cat.makeSound();
	}

}
