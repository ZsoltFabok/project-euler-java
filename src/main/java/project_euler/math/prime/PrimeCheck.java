package project_euler.math.prime;

import java.math.BigInteger;

public class PrimeCheck {
    private final PrimeRepository repository;

    public PrimeCheck(PrimeRepository repository) {
        this.repository = repository;
    }

    /** uses Fermat's little theorem (https://en.wikipedia.org/wiki/Fermat's_little_theorem) */
    public boolean isPrime(Long number) {
        if (number > 2) {
            BigInteger a = BigInteger.valueOf(2L);
            BigInteger n = BigInteger.valueOf(number);

            // Note 1: (a.pow(number-1)-1) % number == 0
            // Note 2: using modPow because pow requires an int exponent
            boolean val = a.modPow(n.subtract(BigInteger.ONE), n).subtract(BigInteger.ONE).mod(n).equals(BigInteger.ZERO);

            return val && !isPseudoPrime(number);
        } else {
            return true;
        }
    }

    /** divides with all the primes that are lower than sqrt(number) */
    private boolean isPseudoPrime(long number) {
        int s = (int) Math.round(Math.sqrt(number));
        // FIXME here I assume that the cache contains the primes, but what should happen when it does not?
        for(long divisor : repository.getInRange(2, s)) {
            if (number % divisor == 0) {
                return true;
            }
        }
        return false;
    }
}
