package com.mock3;

public class qsn1 {
	
	//reverse of  a string and replace the repeating characters with a
	
	public static void main(String[] args) {
		
		String input = "programming";
		String reversed = reverse(input);
		
		char[] chars = reversed.toCharArray();
		for(int i=0; i<chars.length;i++) {
			for(int j=i+1; j<chars.length;j++) {
				if (chars[i]== chars[j] && chars[i] != 'a') {
					chars[j] = 'a';
				}
			}
		}
		String output =new String(chars);
		System.out.println("Original: " +input);
		System.out.println("Reversed: " +reversed);
		System.out.println("Changed: " +output);
	}

	private static String reverse(String input) {
		char [] arr = input.toCharArray();
		String rev = "";
		for(int i = arr.length-1;i>=0;i--) {
			rev+= arr[i];
		}
		return rev;
	}

}
