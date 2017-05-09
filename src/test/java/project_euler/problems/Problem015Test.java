package project_euler.problems;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem015Test {
    private Problem015 problem;

    @Before
    public void setup() {
        problem = new Problem015();
    }

    @Test
    public void twoByTwoGridHasSixRoutes() {
        assertEquals(6, problem.calculate(2));
    }

    @Ignore
    public void solution() {
        assertEquals(-1, problem.execute());
    }
}
