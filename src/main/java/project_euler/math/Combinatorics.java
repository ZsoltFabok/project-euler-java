package project_euler.math;


import java.math.BigInteger;

public class Combinatorics {

    private final Factorial factorial;

    public Combinatorics(Factorial factorial) {
        this.factorial = factorial;
    }

    public long binominalCoefficient(int n, int k) {
        return factorial(n).divide(factorial(k).multiply(factorial(n - k))).longValue();
    }

    private BigInteger factorial(long n) {
        return factorial.factorial(n);
    }
}
