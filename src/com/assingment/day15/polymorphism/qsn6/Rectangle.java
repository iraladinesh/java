package com.assingment.day15.polymorphism.qsn6;


class Rectangle extends Shape {  
 private double length;  
 private double width;  

 public Rectangle(double length, double width) {  
     this.length = length;  
     this.width = width;  
 }

 @Override  
 public double getArea() {  
     return length * width;  
 }

 @Override 
 public double getPerimeter() {  
     return 2 * (length + width);  
 }
}

