package com.assignment.day4;

import java.util.Scanner;

public class VowelOrConsonantCheckerSwitch {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    char ch;

    System.out.printf("Enter a character: ");
    ch = sc.next().charAt(0);

    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
      switch (ch) {
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        System.out.printf("%c is a vowel.\n", ch);
        break;

      default:
        System.out.printf("%c is a consonant.\n", ch);
      }
    } else {
      System.out.printf("%c is not an alphabet.\n", ch);
    }
}
}
