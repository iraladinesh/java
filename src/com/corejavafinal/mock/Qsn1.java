package com.corejavafinal.mock;

import java.util.*;
import java.util.stream.*;

public class Qsn1 {
//take an array , from the  min and max, snd max and min numbers by using streams 
	public static void main(String[] args) {
		 int[] numbers = {12, 13, 56, 47, 58};
		 
		
		 
		 
		 int min = Arrays.stream(numbers)
				   .min()
				   .getAsInt();
		 
		 int max = Arrays.stream(numbers)
				  .max()
				  .getAsInt();
		 
		
		 
		 System.out.println(" Initial Array " +Arrays.toString(numbers));
		 System.out.println(" Minimum Number" +min);
		 System.out.println("Maximum Number" +max);
		 
	}
}
