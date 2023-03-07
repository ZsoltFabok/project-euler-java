package project_euler.math.prime;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PrimeFactoryTest {

    private PrimeFactory factory;
    private PrimeCheck check;
    private PrimeRepository repository;

    @BeforeEach
    public void setup() {
        check = mock(PrimeCheck.class);
        repository = mock(PrimeRepository.class);
        factory = new PrimeFactory(check, repository);
    }

    @Test
    public void nextWorks() {
        when(check.isPrime(2L)).thenReturn(true);
        when(check.isPrime(3L)).thenReturn(true);
        when(check.isPrime(4L)).thenReturn(false);
        when(check.isPrime(5L)).thenReturn(true);

        // Read 2 from cache
        when(repository.next()).thenReturn(2L);
        assertEquals(2, (long) factory.next());

        // Cache had only the 2
        when(repository.next()).thenReturn(null);
        when(repository.last()).thenReturn(2L);
        assertEquals(3, (long) factory.next());
        verify(repository).add(3L);

        assertEquals(5, (long) factory.next());
        verify(repository).add(5L);
    }
}
