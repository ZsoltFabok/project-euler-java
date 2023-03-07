package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem017Test {
    private Problem017 problem;

    @BeforeEach
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
