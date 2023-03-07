package project_euler.problems;

import project_euler.util.DataFile;

import java.math.BigInteger;
import java.util.List;

/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers.
 *
 * See data/problem013.txt
 */
public class Problem013 {
    public long execute() {
        return calculate();
    }

    public long calculate() {
        List<BigInteger> numbers = loadDigits();
        BigInteger sum = numbers.stream().reduce(BigInteger.ZERO, BigInteger::add);
        return Long.valueOf(sum.toString().substring(0, 10));
    }

    private List<BigInteger> loadDigits() {
        return new DataFile().loadData("problem013").stream().map(BigInteger::new).toList();
    }
}
