package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem011Test {
    private Problem011 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem011();
    }

    @Test
    public void solution() {
        // [89, 94, 97, 87] - diagonal to the left
        assertEquals(70600674, problem.execute());
    }
}
