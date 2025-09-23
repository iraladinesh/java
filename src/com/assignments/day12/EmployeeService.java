package com.assignments.day12;

import java.time.LocalDate;

import java.time.Period;

public class EmployeeService {
	
	  private String name;
	 
	  private double salary;
	  
	  private LocalDate hireDate;

	  public EmployeeService(String name, double salary, LocalDate hireDate) {
	    this.name = name;
	    
	    this.salary = salary;
	    
	    this.hireDate = hireDate;
	  }

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }
	  public double getSalary() {
	    return salary;
	  }

	  public void setSalary(double salary) {
	    this.salary = salary;
	  }

	  public LocalDate getHireDate() {
	    return hireDate;
	  }

	  public void setHireDate(LocalDate hireDate) {
	    this.hireDate = hireDate;
	  }

	  public int getYearsOfService() {
	    return Period.between(hireDate, LocalDate.now()).getYears();
	  }
	  public void printEmployeeDetails() {
	    System.out.println("\nName: " + name);
	    System.out.println("Salary: " + salary);
	    System.out.println("Hire Date: " + hireDate);
	  }
	
	  public static void main(String[] args) {
		    
		   
		  EmployeeService employee1 = new EmployeeService("Roberta Petrus", 50000, LocalDate.parse("2021-04-01"));
		  EmployeeService employee2 = new EmployeeService("Loyd Blair", 70000, LocalDate.parse("2015-04-01"));
		  EmployeeService employee3 = new EmployeeService("Magdalena Artemon", 50000, LocalDate.parse("2011-01-15"));

		  employee1.printEmployeeDetails();
		  System.out.println("Years of Service: " + employee1.getYearsOfService());
		  employee2.printEmployeeDetails();
		  System.out.println("Years of Service: " + employee2.getYearsOfService());
		  employee3.printEmployeeDetails();
		  System.out.println("Years of Service: " + employee3.getYearsOfService());
		  }


}
