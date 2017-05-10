package project_euler.math;

import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CombinatoricsTest {

    private Combinatorics combinatorics;
    private Factorial factorial;

    @Before
    public void setup() {
        factorial = mock(Factorial.class);
        combinatorics = new Combinatorics(factorial);
    }

    @Test
    public void  binomialCoefficientOfFourChooseTwoIsSix() {
        when(factorial.factorial(4)).thenReturn(BigInteger.valueOf(24L));
        when(factorial.factorial(2)).thenReturn(BigInteger.valueOf(2L));
        assertEquals(6, combinatorics.binominalCoefficient(4, 2));
    }
}
