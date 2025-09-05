package com.assignments.day2;

public class FloatingPoint {

	public static void main(String[] args) {
		 float a =0.3f;
		 System.out.println("Initial Float Value: "+a);
		 float next_Down = Math.nextDown(a);
		 float next_Up = Math.nextUp(a);
		 System.out.println("Float " +a+ " next down is " +next_Down);
		 System.out.println("Float " +a+ " next Up is " +next_Up);
		 
		 double b =0.4;
		 System.out.println("Initial Double Value: "+b);
		 double next_Down_dbl = Math.nextDown(b);
		 double next_Up_dbl = Math.nextUp(b);
		 System.out.println("Float " +b+ " next down is " +next_Down_dbl);
		 System.out.println("Float " +b+ " next Up is " +next_Up_dbl);
		 
			 

	}

}
