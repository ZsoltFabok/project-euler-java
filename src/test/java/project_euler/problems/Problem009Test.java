package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem009Test {
    private Problem009 problem;

    @Before
    public void setup() {
        problem = new Problem009();
    }

    @Test
    public void productOfThePythagoreanThreeFourFive() {
        assertEquals(3 * 4 * 5, problem.calculate(3 + 4 + 5));
    }

    @Test
    public void solution() {
        assertEquals(31875000, problem.execute());
    }
}
