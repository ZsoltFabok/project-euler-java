package project_euler.problems;


import java.util.stream.LongStream;

/**
 * The sum of the squares of the first ten natural numbers is,
 *
 * 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem006 {

    public long execute() {
        return calculate(20);
    }

    public long calculate(int upperLimit) {
        long sumOfSquares = LongStream.range(1, upperLimit + 1).reduce(0L, (a, b) -> a + b * b);
        long squareOfSum = LongStream.range(1, upperLimit + 1).sum();
        squareOfSum = squareOfSum * squareOfSum;

        return squareOfSum - sumOfSquares;
    }
}
