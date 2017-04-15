package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem008Test {
    private Problem008 problem;

    @Before
    public void setup() {
        problem = new Problem008();
    }

    @Test
    public void greatestProductOfFourAdjacentDigits() {
        assertEquals(5832, problem.calculate(4));
    }

    @Test
    public void solution() {
        assertEquals(23514624000L, problem.execute());
    }
}