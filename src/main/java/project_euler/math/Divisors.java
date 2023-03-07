package project_euler.math;


import project_euler.math.prime.PrimeCheck;
import project_euler.math.prime.PrimeFactors;
import project_euler.math.prime.PrimeFactory;
import project_euler.math.prime.PrimeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.LongStream;

import static project_euler.util.Collections.append;
import static project_euler.util.Collections.sort;

public class Divisors {

    public List<Long> get(long number) {
        // FIXME this is still ugly | NOSONAR
        PrimeRepository repository1 = new PrimeRepository("data/prime_numbers.txt");
        PrimeRepository repository2 = new PrimeRepository("data/prime_numbers.txt");
        PrimeFactors factors = new PrimeFactors(new PrimeFactory(new PrimeCheck(repository1), repository2));

        List<Long> primeFactors = sort(flat(factors.primeFactors(number)));
        List<Long> divisors = new Combination().get(primeFactors).stream().map(Divisors::multiple).toList();

        return sort(append(1L, divisors));
    }

    private static Long multiple(List<Long> list) {
        return list.stream().reduce(1L, (a, b) -> a * b);
    }

    private static List<Long> flat(Map<Long, Long> primeFactors) {
        List<Long> result = new ArrayList<>();
        primeFactors.keySet().forEach(number -> LongStream.range(0, primeFactors.get(number)).forEach(i -> result.add(number)));
        return result;
    }
}
