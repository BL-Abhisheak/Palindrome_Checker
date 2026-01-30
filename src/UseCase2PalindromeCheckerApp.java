/**
 * =========================================================
 * MAIN CLASS – UseCase2HardcodedPalindrome
 * =========================================================
 *
 * Use Case 2: Hardcoded Palindrome Validation
 *
 * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 *
 * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 *
 * This use case introduces fundamental comparison logic
 * before using advanced data structures.
 *
 * @author Developer
 * @version 2.0
 */
public class UseCase2PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Declare and initialize a hardcoded input string.
        String input = "madam";

        // Assume the string is a palindrome initially.
        boolean isPalindrome = true;

        // Loop only till half of the string length.
        for (int i = 0; i < input.length() / 2; i++) {

            // Compare character from the start with character from the end.
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {

                // Mark as not palindrome if mismatch occurs.
                isPalindrome = false;

                // Exit the loop early since condition failed.
                break;
            }
        }

        // Display the input string.
        System.out.println("Input text: " + input);

        // Display whether the string is a palindrome.
        System.out.println("Is it a Palindrome? : " + isPalindrome);
    }
}
