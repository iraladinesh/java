package com.assingment.day8;

import java.util.Arrays;

public class CopyAnArray {
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5,6,7,8,9,10};
		
		int arry1[]=new int[10];
		
		System.out.println("Initial Array:" +Arrays.toString(arr1));
		
		for(int i=0;i<arr1.length;i++) {
			arry1[i] = arr1[i];
		}
		System.out.println("Copied Array:" +Arrays.toString(arry1));
	}

}
