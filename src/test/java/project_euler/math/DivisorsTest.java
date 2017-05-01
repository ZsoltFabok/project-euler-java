package project_euler.math;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DivisorsTest {
    private Divisors divisors;

    @Before
    public void setup() {
        divisors = new Divisors();
    }

    @Test
    public void divisors() {
        assertEquals(Arrays.asList(1L, 2L, 4L, 7L, 14L, 28L), divisors.get(28));
    }
}
