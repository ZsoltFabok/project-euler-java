package project_euler.problems;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;


public class Problem008 {
    public long execute() {
        return calculate(13);
    }

    public long calculate(int numberOfDigits) {
        String data = loadDigits();
        long max = 0;
        for(int i = 0; i < (data.length() - numberOfDigits); i++) {
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
        StringBuilder content = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/problem008.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }
        } catch (IOException exception) {
            // unable to read data file, let the content be empty
        }

        return content.toString();
    }
}
