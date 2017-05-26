package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem019Test {
    private Problem019 problem;

    @Before
    public void setup() {
        problem = new Problem019();
    }

    @Test
    public void solution() {
        assertEquals(171, problem.execute());
    }
}
