package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem012Test {
    private Problem012 problem;

    @BeforeEach
    public void setup() {
        problem = new Problem012();
    }

    @Test
    public void sumOfPrimesBelowThenIsSeventeen() {
        assertEquals(28, problem.calculate(5));
    }

    // FIXME
    @Disabled("it is too slow for travis")
    public void solution() {
        assertEquals(76576500, problem.execute());
    }
}
