/**
 * =========================================================
 * MAIN CLASS – UseCase9RecursivePalindrome
 * =========================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 1.0
 */
public class UseCase9PalindromeCheckerApp {

    /**
     * Application entry point for UC9.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "madam";

        // Display the input
        System.out.println("Input : " + input);

        // Call recursive method and print result
        System.out.println("Is Palindrome? : " + check(input, 0, input.length() - 1));
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s     Input string
     * @param start Starting index
     * @param end   Ending index
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {

        // Base case: crossed indices means success
        if (start >= end)
            return true;

        // If characters mismatch, not a palindrome
        if (s.charAt(start) != s.charAt(end))
            return false;

        // Recursive call moving inward
        return check(s, start + 1, end - 1);
    }
}
