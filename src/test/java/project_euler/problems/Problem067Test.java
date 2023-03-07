package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem067Test {
    private Problem067 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem067();
    }

    @Test
    public void solution() {
        assertEquals(7273, problem.execute());
    }
}
