package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem014Test {
    private Problem014 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem014();
    }

    @Test
    public void twentyHasTheLongestCollatzChainUnderTwenty() {
        assertEquals(19, problem.calculate(20));
    }

    @Test
    public void solution() {
        assertEquals(837799, problem.execute());
    }
}
