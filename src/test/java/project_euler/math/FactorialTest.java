package project_euler.math;


import org.junit.Before;
import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    Factorial factorial = new Factorial();

    @Before
    public void setup() {
        factorial = new Factorial();
    }

    @Test
    public void FactorialOneIsOne() {
        assertEquals(BigInteger.ONE, factorial.factorial(1));
    }

    @Test
    public void FactorialFiveIsOne() {
        assertEquals(BigInteger.valueOf(120), factorial.factorial(5));
    }

}
