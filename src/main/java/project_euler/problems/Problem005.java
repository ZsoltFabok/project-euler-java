package project_euler.problems;

import project_euler.di.ProblemDi;
import project_euler.math.prime.PrimeFactors;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.LongStream;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem005 extends ProblemDi {

    public long execute() {
        return calculate(20);
    }

    /**
     * A number is divisible by the multiplication of its prime factors. For example, if a number is divisible by 9 it
     * is divisible by 3*3. If a number must be divisible by 8 and 9 it must be divisible by 2*2*2 and 3*3. If we add
     * 10, it will be 2*2*2, 3*3, and 2*5. In this case the smallest number is (2*2*2)*(3*3)*5. You don't need the
     * 2 from 10.
     *
     * Following this logic, I'm getting the prime factors for each number between 2 and the @upperLimit, and look for
     * the highest number of a prime factor in a single number. For example the highest number for 2 under 10 is 3
     * (see 8).
     *
     * When the list of prime factors and their highest occurrence is present, they have to be multiplied and there is
     * the result.
     */
    public long calculate(int upperLimit) {
        PrimeFactors factors = injector.getInstance(PrimeFactors.class);

        Map<Long, Long> primeFactorsWithOccurrences = new HashMap<>();

        for (int i = 2; i < upperLimit + 1; i++) {
            Map<Long, Long> p = factors.primeFactors(i);
            p.forEach((k, v) -> {
                primeFactorsWithOccurrences.putIfAbsent(k, v);
                if (primeFactorsWithOccurrences.get(k) < v) {
                    primeFactorsWithOccurrences.put(k, v);
                }
            });
        }

        return primeFactorsWithOccurrences.keySet().stream()
                .reduce(1L, (soFar, next) -> soFar * pow(next, primeFactorsWithOccurrences.get(next)));
    }

    private static long pow(long exponent, long modulus) {
        return LongStream.range(1, modulus + 1).reduce(1L, (a, b) -> a * exponent);
    }
}
