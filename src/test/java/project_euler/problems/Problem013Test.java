package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem013Test {
    private Problem013 problem;

    @Before
    public void setup() {
        problem = new Problem013();
    }

    @Test
    public void solution() {
        assertEquals(5537376230L, problem.execute());
    }
}
