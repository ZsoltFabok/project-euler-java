package project_euler.problems;


import project_euler.util.DataFile;

import java.util.Arrays;


public class Problem008 {
    public long execute() {
        return calculate(13);
    }

    public long calculate(int numberOfDigits) {
        String data = loadDigits();
        long max = 0;
        for (int i = 0; i < (data.length() - numberOfDigits); i++) {
            long value = productOfDigits(data.substring(i, i + numberOfDigits));
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    private long productOfDigits(String digits) {
        return Arrays.stream(digits.split("")).map(Long::valueOf).reduce(1L, (a, b) -> a * b);
    }

    private String loadDigits() {
        return new DataFile().loadData("problem008").stream().reduce("", (a, b) -> a + b);
    }
}
