package project_euler.problems;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem007Test {
    private Problem007 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem007();
    }

    @Test
    public void sixthPrimeIsThirteen() {
        assertEquals(13, problem.calculate(6));
    }

    @Test
    public void solution() {
        assertEquals(104743, problem.execute());
    }
}
