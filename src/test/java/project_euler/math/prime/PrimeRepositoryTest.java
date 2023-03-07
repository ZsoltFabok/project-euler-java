package project_euler.math.prime;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PrimeRepositoryTest {
    private PrimeRepository repository;

    @BeforeEach
    public void setup() {
        repository = new PrimeRepository("test_data/prime_numbers.txt");
    }

    @Test
    public void iteration() {
        assertEquals(2L, (long) repository.next());
        assertEquals(3L, (long) repository.next());
        assertEquals(5L, (long) repository.next());
    }

    @Test
    public void inRange() {
        assertEquals(Arrays.asList(2L, 3L), repository.getInRange(1, 4));
    }
}
