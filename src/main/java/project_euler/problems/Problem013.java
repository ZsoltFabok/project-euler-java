package project_euler.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

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
        List<BigInteger> numbers = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/problem013.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(new BigInteger(line));
            }
        } catch (IOException exception) {
            // unable to read data file, let the content be empty
        }

        return numbers;
    }
}
