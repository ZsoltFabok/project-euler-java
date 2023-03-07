package project_euler.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Problem016Test {
    private Problem016 problem;

    @BeforeEach
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
