package project_euler.not_used;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SieveOfEratosthenesTest {

    @Test
    public void returnsTwoUnderTwo() {
        assertEquals(Collections.singletonList(2L), new SieveOfEratosthenes().getPrimeNumbers(3));
    }

    @Test
    public void returnsTwoThreeFiveSevenUnderTen() {
        assertEquals(Arrays.asList(2L, 3L, 5L, 7L), new SieveOfEratosthenes().getPrimeNumbers(10));
    }
}
