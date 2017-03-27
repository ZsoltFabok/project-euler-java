package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Problem003Test {

    private Problem003 problem;

    @Before
    public void setup() {
        problem = new Problem003();
    }

    @Test
    public void returnsThreeForThree() {
        assertEquals(3L, problem.calculate(3L));
    }

    @Test
    public void returnsThirteenFor9438() {
        assertEquals(13L, problem.calculate(9438L));
    }

    @Test
    public void solution() {
        assertEquals(6857L, problem.execute());
    }
}
