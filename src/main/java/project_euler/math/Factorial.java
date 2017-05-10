package project_euler.math;


import java.math.BigInteger;
import java.util.stream.LongStream;

public class Factorial {
    public BigInteger factorial(long number) {
        return LongStream.range(1, number + 1).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, Factorial::multiply);
    }

    private static BigInteger multiply(BigInteger a, BigInteger b) {
        return a.multiply(b);
    }
}
