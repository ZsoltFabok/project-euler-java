package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem019Test {
    private Problem019 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem019();
    }

    @Test
    public void solution() {
        assertEquals(171, problem.execute());
    }
}
