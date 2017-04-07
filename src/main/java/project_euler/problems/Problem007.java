package project_euler.problems;

import project_euler.math.prime.PrimeCheck;
import project_euler.math.prime.PrimeFactory;


/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class Problem007 {
    public long execute() {
        return calculate(10001);
    }

    public long calculate(int index) {
        PrimeCheck check = new PrimeCheck();
        PrimeFactory factory = new PrimeFactory(check);

        for (int i = 0; i < (index - 1); i++) {
            factory.next();
        }

        return factory.next();
    }
}
