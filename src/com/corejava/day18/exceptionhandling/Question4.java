package com.corejava.day18.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question4 {
	
	//File Content Exception
	
	    public static void main(String[] args) {
	        try {
	            checkNumbersFromFile("C:\\Projects\\core_java\\src\\com\\corejava\\day18\\exceptionhandling\\testnumbers.txt");
	            System.out.println("All numbers are non-positive.");
	        } catch (FileNotFoundException e) {
	            System.out.println("Error: " + e.getMessage());
	        } catch (PositiveNumberException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	    public static void checkNumbersFromFile(String fileName) throws FileNotFoundException, PositiveNumberException {
	        File file = new File(fileName);
	        Scanner scanner = new Scanner(file);
	        while (scanner.hasNextLine()) {
	            int number = Integer.parseInt(scanner.nextLine());
	            if (number > 0) {
	                throw new PositiveNumberException("Positive number found: " + number);
	            }
	        }
	        scanner.close();
	    }
	}
	class PositiveNumberException extends Exception {
	    public PositiveNumberException(String message) {
	        super(message);
	    }
	}



