package com.assignments.day12;

public class Rectangle {
	
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(7, 5);
		System.out.println("Area of the rectangle: " +rectangle.getArea());
		System.out.println("Area of the rectangle: " +rectangle.getPerimeter());
		
		
		rectangle.setWidth(8);
		rectangle.setHeight(7);
		
		System.out.println("Area of the rectangle: " +rectangle.getArea());
		System.out.println("Area of the rectangle: " +rectangle.getPerimeter());
	}

}
