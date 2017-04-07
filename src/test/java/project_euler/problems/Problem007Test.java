package project_euler.problems;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem007Test {
    private Problem007 problem;

    @Before
    public void setup() {
        problem = new Problem007();
    }

    @Test
    public void sixthPrimeIsThirteen() {
        assertEquals(13, problem.calculate(6));
    }

    @Test
    public void solution() {
        assertEquals(104743, problem.execute());
    }
}
