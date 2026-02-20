import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Declare and initialize input string
        String input = "noon";


        Stack<Character> stack = new Stack<>();


        for (char c : input.toCharArray()) {
            stack.push(c);
        }


        boolean isPalindrome = true;


        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }


        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}