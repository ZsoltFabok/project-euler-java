package project_euler.problems;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem005Test {

    private Problem005 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem005();
    }

    @Test
    public void smallestNumberEvenlyDivisibleByAllNumbersFromOneToTen() {
        assertEquals(2520, problem.calculate(10));
    }

    @Test
    public void solution() {
        assertEquals(232792560, problem.execute());
    }
}
