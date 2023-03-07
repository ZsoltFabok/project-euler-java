package project_euler.problems;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem006Test {

    private Problem006 problem;

    @BeforeEach
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
