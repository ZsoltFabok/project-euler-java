package project_euler.problems;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem002Test {

    private Problem002 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem002();
    }

    @Test
    public void returns_2_for_range_1_5() {
        assertEquals(2, problem.calculate(5));
    }

    @Test
    public void returns_4613732_for_range_1_4000000() {
        assertEquals(4613732, problem.calculate(4000000));
    }

    @Test
    public void solution() {
        assertEquals(4613732, problem.execute());
    }
}
