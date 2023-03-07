package project_euler.math;


import com.google.inject.Inject;

import java.math.BigInteger;

public class Combinatorics {

    private final Factorial factorial;

    @Inject
    public Combinatorics(Factorial factorial) {
        this.factorial = factorial;
    }

    public long binominalCoefficient(long n, long k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k))).longValue();
    }

    private BigInteger factorial(long n) {
        return factorial.factorial(n);
    }
}
