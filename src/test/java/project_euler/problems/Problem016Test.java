package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem016Test {
    private Problem016 problem;

    @Before
    public void setup() {
        problem = new Problem016();
    }

    @Test
    public void sumOfDigitsOfTwoRaisingToPowerFifteenIsTwentySix() {
        assertEquals(26, problem.calculate(15));
    }

    @Test
    public void solution() {
        assertEquals(1366, problem.execute());
    }
}
