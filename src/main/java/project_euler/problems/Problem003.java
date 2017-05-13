package project_euler.problems;


import project_euler.di.ProblemDi;
import project_euler.math.prime.PrimeCheck;
import project_euler.math.prime.PrimeFactors;
import project_euler.math.prime.PrimeFactory;
import project_euler.math.prime.PrimeRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 The prime factors of 13195 are 5, 7, 13 and 29.
 What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 extends ProblemDi {
    public long execute() {
        return calculate(600851475143L);
    }

    public long calculate(long number) {
        PrimeFactors factors = injector.getInstance(PrimeFactors.class);

        return max(factors.primeFactors(number).keySet());
    }

    private static Long max(Set<Long> set) {
        return Collections.max(set);
    }
}
