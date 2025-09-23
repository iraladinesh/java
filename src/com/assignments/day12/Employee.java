package com.assignments.day12;


public class Employee {
		 private String name;
 		 private String jobTitle;
		 private double salary;
		
		 public Employee(String name, String jobTitle, double salary) {
		     this.name = name;
		     this.jobTitle = jobTitle;
		     this.salary = salary;
		 }
		
		 public String getName() {
		     return name;
		 }
		
		 public void setName(String name) {
		     this.name = name;
		 }
		
		 public String getJobTitle() {
		     return jobTitle;
		 }
		
		 public void setJobTitle(String jobTitle) {
		     this.jobTitle = jobTitle;
		 }
		
		 public double getSalary() {
		     return salary;
		 }
		
		 public void setSalary(double salary) {
		     this.salary = salary;
		 }
		
		 public void raiseSalary(double percentage) {
		     salary = salary + salary * percentage / 100;
		 }
		
		 public void printEmployeeDetails() {
		     System.out.println("Name: " + name);
		     System.out.println("Job Title: " + jobTitle);
		     System.out.println("Salary: " + salary);
		 }
		 
		 public static void main(String[] args) {

		        Employee employee1 = new Employee("Rameshwar", "HR Manager", 40000);
		        Employee employee2 = new Employee("Rupak", "Software Engineer", 60000);

		        System.out.println("\nEmployee Details:");
		        employee1.printEmployeeDetails();
		        employee2.printEmployeeDetails();

		        employee1.raiseSalary(5);
		        employee2.raiseSalary(7);

		        System.out.println("\nAfter raising salary:");
		        System.out.println("\n5% for 'Rameshwar':");
		        employee1.printEmployeeDetails();
		        System.out.println("\n7% for 'Rupak':");
		        employee2.printEmployeeDetails();
		    }
		
}
