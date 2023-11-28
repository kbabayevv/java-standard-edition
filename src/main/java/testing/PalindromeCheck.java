package testing;

import java.util.Scanner;

public class PalindromeCheck {
    // Function to check if a given string is a palindrome
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two words
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine().toLowerCase();

        // Check if the words are palindromes
        if (isPalindrome(word1) && isPalindrome(word2)) {
            System.out.println("Both words are palindromes.");
        } else {
            System.out.println("The words are not palindromes.");
        }
        scanner.close();
    }
}
