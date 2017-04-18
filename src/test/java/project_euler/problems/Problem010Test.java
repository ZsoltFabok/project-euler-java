package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem010Test {
    private Problem010 problem;

    @Before
    public void setup() {
        problem = new Problem010();
    }

    @Test
    public void sumOfPrimesBelowThenIsSeventeen() {
        assertEquals(2 + 3 + 5 + 7, problem.calculate(10));
    }

    @Test
    public void solution() {
        assertEquals(142913828922L, problem.execute());
    }
}

