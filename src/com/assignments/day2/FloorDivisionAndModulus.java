package com.assignments.day2;

public class FloorDivisionAndModulus {

	public static void main(String[] args) {
		int a = 4567;
		int b= 143;
		System.out.println("Floor Division using '/' operator: " +(a/b));
		System.out.println("Floor Division using floorDiv() method: "+Math.floorDiv(a, b));
		
		System.out.println("Floor Modulus using '%': " +(a%b));
		System.out.println("Floor Modulus using floorMod():" +Math.floorMod(a, b));

	}

}
