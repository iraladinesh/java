package com.assingment.day8;

public class AvgOfArray {
	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		double avg= sum/arr.length;
	System.out.print("The aveage of the array is: "+avg);	
	}

}
