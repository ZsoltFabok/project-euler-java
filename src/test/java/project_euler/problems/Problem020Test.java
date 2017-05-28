package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem020Test {
    private Problem020 problem;

    @Before
    public void setup() {
        problem = new Problem020();
    }

    @Test
    public void sumOfTheDigitsOfThenFactorialIsTwentySeven() {
        assertEquals(27, problem.calculate(10));
    }

    @Test
    public void solution() {
        assertEquals(648, problem.execute());
    }
}
