package project_euler.problems;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem014Test {
    private Problem014 problem;

    @Before
    public void setup() {
        problem = new Problem014();
    }

    @Test
    public void twentyHasTheLongestCollatzChainUnderTwenty() {
        assertEquals(19, problem.calculate(20));
    }

    @Test
    public void solution() {
        assertEquals(837799, problem.execute());
    }
}
