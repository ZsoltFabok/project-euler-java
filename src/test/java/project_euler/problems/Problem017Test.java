package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem017Test {
    private Problem017 problem;

    @Before
    public void setup() {
        problem = new Problem017();
    }

    @Test
    public void sumOfTheLettersFromOneToFiveIsNineteen() {
        assertEquals(19, problem.calculate(5));
    }

    @Test
    public void solution() {
        assertEquals(21124, problem.execute());
    }
}
