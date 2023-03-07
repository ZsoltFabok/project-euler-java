package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem001Test {

    private Problem001 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem001();
    }

    @Test
    public void returns_23_for_numbers_below_10() {
        assertEquals(23, problem.calculate(10));
    }

    @Test
    public void returns_233168_for_numbers_below_1000() {
        assertEquals(233168, problem.calculate(1000));
    }

    @Test
    public void solution() {
        assertEquals(233168, problem.execute());
    }
}
