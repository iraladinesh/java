package com.corejava.day15.polymorphism;

public class Product {
	
	public void addProduct(int a, int b) {
		System.out.println("two ints");
	}
	public void addProduct(float a, int b) {
		System.out.println("float a int b");
	}
	public void addProduct(int a, float b) {
		System.out.println("int a float b");
	}

}
