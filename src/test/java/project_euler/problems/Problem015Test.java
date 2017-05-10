package project_euler.problems;

import org.junit.Before;
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

    @Test
    public void solution() {
        assertEquals(137846528820L, problem.execute());
    }
}
