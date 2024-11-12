package org.example.assignment2;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {
        // Author: Juned
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder filteredInput = new StringBuilder();

        // Normalize the string by removing spaces, punctuation, and converting to lowercase
        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                filteredInput.append(lowerCh);
                stack.push(lowerCh);
            }
        }

        // Check if the string reads the same forwards and backwards
        for (int i = 0; i < filteredInput.length(); i++) {
            if (filteredInput.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
