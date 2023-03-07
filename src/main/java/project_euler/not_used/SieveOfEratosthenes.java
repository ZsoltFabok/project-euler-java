package project_euler.not_used;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class SieveOfEratosthenes {

    private class Data {
        List<Long> primes;
        List<Long> rest;

        Data() {
            this(new ArrayList<>(), new ArrayList<>());
        }

        Data(List<Long> primes, List<Long> rest) {
            this.primes = primes;
            this.rest = rest;
        }
    }

    List<Long> getPrimeNumbers(int upperLimit) {
        List<Long> numbers = LongStream.range(2, upperLimit).boxed().collect(Collectors.toList()); // NOSONAR (java:S6204)

        Data data = new Data();
        data.rest = numbers;

       return sieve(data).primes;
    }

    private Data sieve(Data data) {
        Data newData = new Data();

        // Store previous primes
        newData.primes.addAll(data.primes);

        // Take the first item because the is the next prime
        Long currentPrime = data.rest.remove(0);
        newData.primes.add(currentPrime);

        // sieve the next prime from the list
        newData.rest.addAll(filter(i -> i % currentPrime != 0, data.rest));

        if (newData.rest.isEmpty()) {
            return newData;
        } else {
            return sieve(newData);
        }
    }

    private static <T> List<T> filter(Predicate<? super T> predicate, List<T> list) {
        return list.stream().filter(predicate).toList();
    }
}
