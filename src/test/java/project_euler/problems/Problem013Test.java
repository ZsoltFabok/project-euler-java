package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem013Test {
    private Problem013 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem013();
    }

    @Test
    public void solution() {
        assertEquals(5537376230L, problem.execute());
    }
}
