package project_euler.math.prime;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class PrimeFactoryTest {

    private PrimeFactory factory;
    private PrimeCheck check;

    @Before
    public void setup() {
        check = mock(PrimeCheck.class);
        factory = new PrimeFactory(check);
    }

    @Test
    public void nextWorks() {
        when(check.isPrime(2L)).thenReturn(true);
        when(check.isPrime(3L)).thenReturn(true);
        when(check.isPrime(4L)).thenReturn(false);
        when(check.isPrime(5L)).thenReturn(true);

        assertEquals(2, (long) factory.next());
        assertEquals(3, (long) factory.next());
        assertEquals(5, (long) factory.next());
    }
}
