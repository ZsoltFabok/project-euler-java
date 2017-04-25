package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem011Test {
    private Problem011 problem;

    @Before
    public void setup() {
        problem = new Problem011();
    }

    @Test
    public void solution() {
        // [89, 94, 97, 87] - diagonal to the left
        assertEquals(70600674, problem.execute());
    }
}
