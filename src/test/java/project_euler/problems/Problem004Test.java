package project_euler.problems;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem004Test {

    private Problem004 problem;

    @Before
    public void setup() {
        problem = new Problem004();
    }

    @Test
    public void forOneReturns9() {
        assertEquals(9, problem.calculate(1));
    }

    @Test
    public void forTwoDigitsReturns9009() {
        assertEquals(9009, problem.calculate(2));
    }

    @Test
    public void solution() {
        assertEquals(906609, problem.execute());
    }
}
