package project_euler.problems;


/**
 A palindromic number reads the same both ways.
 The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {
    public int execute() {
        return calculate(3);
    }

    public int calculate(int numberOfDigits) {
        int bestNumber = 0;
        int upperLimit = toUpperLimit(numberOfDigits);
        for (int i = upperLimit; i > 0; i--) {
            for (int j = upperLimit; j > 0; j--) {
                int number = i * j;
                if (isPalindrome(number) && number > bestNumber) {
                    bestNumber = number;
                }
            }
        }
        return bestNumber;
    }

    private static int toUpperLimit(int numberOfDigits) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numberOfDigits; i++) {
            s.append("9");
        }
        return Integer.valueOf(s.toString());
    }

    private static boolean isPalindrome(Integer number) {
        return number.toString().equals(reverse(number));
    }

    private static String reverse(Integer number) {
        return new StringBuilder(number.toString()).reverse().toString();
    }
}
