import java.util.Scanner;

public class TextProcessor {
    private String[] strings;

    // Constructor to input strings
    public TextProcessor(int n, Scanner sc) {
        strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = sc.nextLine();
        }
    }

    // Method to process strings
    public void processStrings() {
        for (String str : strings) {
            System.out.println("\nOriginal String: " + str);

            // Count vowels and consonants
            int vowels = 0, consonants = 0;
            for (char c : str.toLowerCase().toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    if ("aeiou".indexOf(c) != -1) vowels++;
                    else consonants++;
                }
            }

            // Uppercase & Lowercase
            String upper = str.toUpperCase();
            String lower = str.toLowerCase();

            // String reversal
            String reversed = new StringBuilder(str).reverse().toString();

            // Palindrome check
            boolean isPalindrome = str.equalsIgnoreCase(reversed);

            // Output results
            System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
            System.out.println("Uppercase: " + upper);
            System.out.println("Lowercase: " + lower);
            System.out.println("Reversed: " + reversed);
            System.out.println("Palindrome: " + (isPalindrome ? "Yes" : "No"));
        }
    }
}