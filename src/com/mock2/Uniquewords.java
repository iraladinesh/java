package com.mock2;

public class Uniquewords {
    public static void main(String[] args) {
        String sentence = "This is Rama World";

        // Split the sentence into words
        String[] words = sentence.split(" ");

        System.out.println("Words without duplicate characters:");
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            if (hasUniqueChars(word)) {
                System.out.println(words[i]); // print original form
            }
        }
    }

    
    public static boolean hasUniqueChars(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false; // duplicate found
                }
            }
        }
        return true;
    }
}