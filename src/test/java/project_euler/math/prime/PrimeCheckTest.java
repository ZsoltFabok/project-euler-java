package project_euler.math.prime;


import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PrimeCheckTest {

    private PrimeCheck check;
    private PrimeRepository repository;

    @Before
    public void setup() {
        repository = mock(PrimeRepository.class);
        check = new PrimeCheck(repository);
    }

    @Test
    public void twoIsPrime() {
        when(repository.getInRange(2, 2)).thenReturn(Collections.singletonList(2L));
        assertTrue(check.isPrime(2L));
    }

    @Test
    public void fiveIsPrime() {
        when(repository.getInRange(2, 2)).thenReturn(Collections.singletonList(2L));
        assertTrue(check.isPrime(5L));
    }

    @Test
    public void eightIsNotPrime() {
        when(repository.getInRange(2, 3)).thenReturn(Arrays.asList(2L, 3L));
        assertFalse(check.isPrime(8L));
    }

    @Test
    public void sixtyForIsNotPrime() {
        when(repository.getInRange(2, 8)).thenReturn(Arrays.asList(2L, 3L, 5L, 7L));
        assertFalse(check.isPrime(64L));
    }
}
