/**
 * =========================================================
 * MAIN CLASS – UseCase3PalindromeCheckerApp
 * =========================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 * - Iterates the string in reverse order
 * - Builds a reversed version
 * - Compares original and reversed strings
 * - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Developer
 * @version 3.0
 */

public class UseCase3PalindromeCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize the input string.
        String input = "level";

        // Variable to store the reversed string.
        String reversed = "";

        // Iterate from the last character to the first.
        for (int i = input.length() - 1; i >= 0; i--) {

            // Append each character to the reversed string.
            reversed += input.charAt(i);
        }

        // Display the original string.
        System.out.println("Original : " + input);

        // Display the reversed string.
        System.out.println("Reversed : " + reversed);

        // Compare both strings and display result.
        System.out.println("Is Palindrome? : " + input.equals(reversed));
    }
}
