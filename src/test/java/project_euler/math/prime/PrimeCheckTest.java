package project_euler.math.prime;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeCheckTest {

    private PrimeCheck check;

    @Before
    public void setup() {
        check = new PrimeCheck();
    }

    @Test
    public void twoIsPrime() {
        assertTrue(check.isPrime(2L));
    }

    @Test
    public void fiveIsPrime() {
        assertTrue(check.isPrime(5L));
    }

    @Test
    public void eightIsNotPrime() {
        assertFalse(check.isPrime(8L));
    }

    @Test
    public void sixtyForIsNotPrime() {
        assertFalse(check.isPrime(64L));
    }
}
