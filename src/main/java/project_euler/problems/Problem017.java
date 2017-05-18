package project_euler.problems;

import project_euler.util.Converter;

import java.util.stream.IntStream;

/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there
 * are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 *
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words,
 * how many letters would be used?
 */
public class Problem017 {
    public long execute() {
        return calculate(1000);
    }

    public int calculate(int number) {
        Converter converter = new Converter();
        return IntStream.range(1, number + 1).reduce(0, (a, b) -> a + removeExtra(converter.toLetters(b)).length());
    }

    private static String removeExtra(String numberInLetters) {
        return numberInLetters.replaceAll(" ", "").replaceAll("-", "");
    }
}
