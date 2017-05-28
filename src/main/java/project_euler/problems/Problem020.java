package project_euler.problems;

import project_euler.math.Factorial;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem020 {
    public long execute() {
        return calculate(100);
    }

    public int calculate(int number) {
        return toDigits(new Factorial().factorial(number).toString()).stream().reduce(0, (a, b) -> a + b);
    }

    private static List<Integer> toDigits(String number) {
        return Stream.of(number.split("")).map(Integer::valueOf).collect(Collectors.toList());
    }
}
