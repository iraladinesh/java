package com.assingment.day15.polymorphism.qsn6;


class Circle extends Shape {  
 private double radius;  

 public Circle(double radius) {  
     this.radius = radius;  
 }

 @Override  
 public double getArea() {  
     return Math.PI * radius * radius;  
 }

 @Override  
 public double getPerimeter() {  
     return 2 * Math.PI * radius;  
 }
} 

