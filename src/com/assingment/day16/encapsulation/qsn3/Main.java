package com.assingment.day16.encapsulation.qsn3;


public class Main {
 public static void main(String[] args) {
     Rectangle rectangle = new Rectangle();

     rectangle.setLength(6.7);
     rectangle.setWidth(12.0);

     double length = rectangle.getLength();
     double width = rectangle.getWidth();

     System.out.println("Length: " + length);
     System.out.println("Width: " + width);
 }
}

