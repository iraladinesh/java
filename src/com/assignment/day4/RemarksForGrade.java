package com.assignment.day4;
import java.util.Scanner;

public class RemarksForGrade {

    public static void main(String args[])
    {
		Scanner sc = new Scanner(System.in);
		char g;
		System.out.println("Please Select Grade : A, B, C, D or F");
		
		g = sc.next().charAt(0);
        System.out.println("Grade : " + g);
		char grade = Character.toUpperCase(g);
        switch(grade)
        {
            case 'A':
                System.out.println("Remark : Excellent!");
                break;
            case 'B':
                System.out.println("Remark : Well Done");
                break;
            case 'C':
                System.out.println("Remark : Very Good");
                break;
            case 'D':
                System.out.println("Remark : Good");
                break;
            case 'F':
                System.out.println("Remark : Fail");
                break;
            default:
                System.out.println("Invalid Grade");
				break;
        }
    }
}