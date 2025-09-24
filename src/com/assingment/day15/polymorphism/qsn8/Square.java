package com.assingment.day15.polymorphism.qsn8;


class Square extends Shape {

private double side;

public Square(double side) {
 this.side = side;
}

@Override
public void draw() {
 System.out.println("Drawing a square");
}

@Override
public double calculateArea() {
 return side * side;
}
}

