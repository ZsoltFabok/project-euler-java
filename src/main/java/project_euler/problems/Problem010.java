package project_euler.problems;

import project_euler.math.prime.PrimeCheck;
import project_euler.math.prime.PrimeFactory;
import project_euler.math.prime.PrimeRepository;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public class Problem010 {
    public long execute() {
        return calculate(2000000);
    }


    public long calculate(int upperLimit) {
        PrimeRepository repository = new PrimeRepository("data/prime_numbers.txt");
        PrimeCheck check = new PrimeCheck(repository);
        PrimeFactory factory = new PrimeFactory(check, repository);

        long sum = 0;
        long prime;
        while ((prime = factory.next()) < upperLimit) {
            sum += prime;
        }

        return sum;
    }
}
