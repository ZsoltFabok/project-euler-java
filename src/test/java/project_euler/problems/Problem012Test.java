package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem012Test {
    private Problem012 problem;

    @Before
    public void setup() {
        problem = new Problem012();
    }

    @Test
    public void sumOfPrimesBelowThenIsSeventeen() {
        assertEquals(28, problem.calculate(5));
    }

    @Test
    public void solution() {
        assertEquals(76576500, problem.execute());
    }
}
