package project_euler.math;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactorialTest {

    Factorial factorial = new Factorial();

    @BeforeEach
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
