package project_euler.math;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DivisorsTest {
    private Divisors divisors;

    @BeforeEach
    public void setup() {
        divisors = new Divisors();
    }

    @Test
    public void divisors() {
        assertEquals(Arrays.asList(1L, 2L, 4L, 7L, 14L, 28L), divisors.get(28));
    }
}
