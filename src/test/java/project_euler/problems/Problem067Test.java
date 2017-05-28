package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem067Test {
    private Problem067 problem;

    @Before
    public void setup() {
        problem = new Problem067();
    }
    
    @Test
    public void solution() {
        assertEquals(7273, problem.execute());
    }
}
