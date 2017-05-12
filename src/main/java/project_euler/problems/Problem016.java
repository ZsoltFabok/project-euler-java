package project_euler.problems;

import java.math.BigInteger;
import java.util.stream.Stream;

/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */
public class Problem016 {
    public long execute() {
        return calculate(1000);
    }

    public int calculate(int exponent) {
        return Stream.of(BigInteger.valueOf(2).pow(exponent).toString().split("")).mapToInt(Integer::valueOf).sum();
    }
}
