package Java_strings;
import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter a string: ");
        String str = scan.nextLine();
        
        // String containing all the vowels
        String vowels = "aeiouAEIOU";
        boolean hasVowels = false;
        
        // Using StringBuilder to modify the string
        StringBuilder modifiedStr = new StringBuilder(str);

        // Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            // Check if the character is a vowel
            if (vowels.indexOf(x) != -1) {
                // Replace the vowel with 'z'
                modifiedStr.setCharAt(i, 'z');
                hasVowels = true;
            }
        }

        // Print the modified string if vowels were found, otherwise print the original string with a message
        if (hasVowels) {
            System.out.println("Modified string: " + modifiedStr);
        } else {
            System.out.println("No vowels present: " + str);
        }

        // Close the scanner to avoid resource leaks
        scan.close();
    }
}
