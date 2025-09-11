package com.assingment.day8;

public class SpecificValueInArray {

	   	   public static boolean contains(int[] arr, int item) {
	      
	      for (int n : arr) {
	    	  		if (item == n) {
        	            return true;
	          }
	      }
	      
	      return false;
	   }
	   
	  	   public static void main(String[] args) {
	       int[] my_array1 = { 101,201,1234,34,78,993,976};
	      
	      System.out.println(contains(my_array1, 993));
	        }
	


}
