package com.corejava.day18.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {
	//file not found exception
	public static void main(String[] args) {
		try {
			readFile("test.txt");
		}catch(FileNotFoundException e) {
			System.out.println("Error " +e.getMessage());
		}
	}

	public static void readFile(String string) throws FileNotFoundException {
		String filename = "test.txt";
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String line =scanner.nextLine();
			System.out.println(line);
		}
		
	}

}
