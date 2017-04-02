package project_euler.problems;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem006Test {

    private Problem006 problem;

    @Before
    public void setup() {
        problem = new Problem006();
    }

    @Test
    public void sumOfSquaresMinusSquareOfSumFromOneToTen() {
        assertEquals(2640, problem.calculate(10));
    }

    @Test
    public void solution() {
        assertEquals(41230, problem.execute());
    }
}
