package com.assingment.day15.polymorphism.qsn7;


class Bird extends Animal {  
 @Override  
 public void move() {  
     System.out.println("Bird flies");  
 }

 @Override 
 public void makeSound() {  
     System.out.println("Bird chirps");  
 }
}

