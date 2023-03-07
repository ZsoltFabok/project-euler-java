package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem020Test {
    private Problem020 problem;

    @BeforeEach
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
