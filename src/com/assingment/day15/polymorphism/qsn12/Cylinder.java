package com.assingment.day15.polymorphism.qsn12;


class Cylinder extends Circle {
private double height;

public Cylinder(double radius, double height) {
 super(radius);
 this.height = height;
}

@Override
public void draw() {
 System.out.println("Drawing a cylinder");
}

@Override
public double calculateArea() {
 double circleArea = super.calculateArea();
 double sideArea = 2 * Math.PI * getRadius() * height;
 return 2 * circleArea + sideArea;
}
}

