package project_euler.math.prime;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrimeCheck {
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

    /** these are the divisors of pseudo primes before 104729 */
    private static final List<Integer> PSEUDO_PRIME_DIVISORS =
            Arrays.asList(3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 43, 53, 59, 61, 71, 73, 89, 97, 101, 103, 127, 149, 151, 157, 167, 229);

    private static boolean isPseudoPrime(long number) {
        long s = Math.round(Math.sqrt(number));
        for(long divisor : PSEUDO_PRIME_DIVISORS.stream().filter(i -> i < s).collect(Collectors.toList())) {
            if (number % divisor == 0) {
                return true;
            }
        }
        return false;
    }
}
