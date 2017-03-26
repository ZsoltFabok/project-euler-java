package project_euler.math.prime;


import java.math.BigInteger;

public class PrimeCheck {

    /** uses Fermat's little theorem (https://en.wikipedia.org/wiki/Fermat's_little_theorem) */
    public boolean isPrime(Long number) {
        if (number > 2) {
            BigInteger a = BigInteger.valueOf(2L);
            BigInteger n = BigInteger.valueOf(number);

            // Note 1: (a.pow(number-1)-1) % number == 0
            // Note 2: using modPow because pow requires an int exponent
            return a.modPow(n.subtract(BigInteger.ONE), n).subtract(BigInteger.ONE).mod(n).equals(BigInteger.ZERO);
        } else {
            return true;
        }
    }
}
