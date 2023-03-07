package project_euler.math.prime;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PrimeFactorsTest {

    private PrimeFactors factors;
    private PrimeFactory factory;

    @BeforeEach
    public void setup() {
        factory = mock(PrimeFactory.class);
        factors = new PrimeFactors(factory);
    }

    @Test
    public void primeFactorsOfSixteen() {
        when(factory.next()).thenReturn(2L);
        Map<Long, Long> expected = new HashMap<>();
        expected.put(2L, 4L);
        assertEquals(expected, factors.primeFactors(16L));
        verify(factory).reset();
    }

    @Test
    public void primeFactorsOfTen() {
        when(factory.next()).thenReturn(2L, 3L, 5L);
        Map<Long, Long> expected = new HashMap<>();
        expected.put(2L, 1L);
        expected.put(5L, 1L);
        assertEquals(expected, factors.primeFactors(10L));
        verify(factory).reset();
    }
}
