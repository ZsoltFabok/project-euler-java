package project_euler.problems;

import java.util.stream.IntStream;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem001 {
    public int execute() {
        return calculate(1000);
    }

    int calculate(int limit) {
        return IntStream.range(0, limit).filter(n -> n % 3 == 0 || n % 5 == 0).sum();
    }
}
