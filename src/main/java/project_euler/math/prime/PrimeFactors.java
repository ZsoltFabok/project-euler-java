package project_euler.math.prime;


import com.google.inject.Inject;

import java.util.HashMap;
import java.util.Map;

public class PrimeFactors {

    private final PrimeFactory factory;

    @Inject
    public PrimeFactors(PrimeFactory factory) {
        this.factory = factory;
    }

    public Map<Long, Long> primeFactors(long number) {
        factory.reset();
        Long currentPrime = factory.next();
        Map<Long, Long> primeFactors = new HashMap<>();

        while (number != 1) {
            if (number % currentPrime == 0) {
                increaseInMap(primeFactors, currentPrime);
                number = number / currentPrime;
            } else {
                currentPrime = factory.next();
            }
        }

        return  primeFactors;
    }

    private static void increaseInMap(Map<Long, Long> map, Long key) {
        Long p = map.get(key);
        if (p == null) {
            p = 0L;
        }
        map.put(key, p + 1);
    }
}
