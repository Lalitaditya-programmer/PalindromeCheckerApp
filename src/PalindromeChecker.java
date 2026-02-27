public class PalindromeChecker {

    public static void main(String[] args) {

        String input = "Level";

        PalindromeStrategy strategy = new StackStrategy();

        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        long endTime = System.nanoTime();

        long executionTime = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + executionTime + " ns");
    }
}


interface PalindromeStrategy {
    boolean check(String input);
}


class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toLowerCase().toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toLowerCase().toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}