package com.assingment.day8;

public class GridPattern {

	    public static void main(String[] args) {
	        
	        int rows = 10;
	        int cols = 10;

	        String[][] grid = new String[rows][cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                grid[i][j] = "-";
	            }
	        }
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                System.out.print(grid[i][j] + " "); 
	            }
	            System.out.println(); 
	        }
	    }
	

}
