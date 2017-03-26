package project_euler.problems;


import project_euler.math.prime.PrimeCheck;
import project_euler.math.prime.PrimeFactory;

import java.util.ArrayList;
import java.util.List;

/**
 The prime factors of 13195 are 5, 7, 13 and 29.
 What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {
    public long execute() {
        return calculate(600851475143L);
    }

    public Long calculate(long number) {
        PrimeFactory factory = new PrimeFactory(new PrimeCheck());

        Long currentPrime = factory.next();
        List<Long> primeFactors = new ArrayList<>();

        while(number != 1) {
            if (number % currentPrime == 0) {
                primeFactors.add(currentPrime);
                number = number / currentPrime;
            } else {
                currentPrime = factory.next();
            }
        }

        return last(primeFactors);
    }

    private static Long last(List<Long> list) {
        return list.get(list.size() - 1);
    }
}
