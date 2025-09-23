package com.assignments.day12;

public class Dog {
	
	private String name;
	private String breed;
	
	public Dog(String name, String breed){
		this.name = name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
		}
	
	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Maxie","Pug");
		Dog dog2 = new Dog("Charlie","Pitbull");
		
		System.out.println("Initial Dog 1 Name: "+dog1.getName()+" , Breed = "+dog1.getBreed());
		System.out.println("Initial Dog 1 Name: "+dog2.getName()+" , Breed = "+dog2.getBreed());
		
		dog1.setName("Strelyy");
		dog1.setBreed("Retriver");
		dog2.setName("Ruffy");
		dog2.setBreed("Labrador");
		
		System.out.println("Initial Dog 1 Name: "+dog1.getName()+" , Breed = "+dog1.getBreed());
		System.out.println("Initial Dog 1 Name: "+dog2.getName()+" , Breed = "+dog2.getBreed());

		
		
		
		
		
	}
	

}
