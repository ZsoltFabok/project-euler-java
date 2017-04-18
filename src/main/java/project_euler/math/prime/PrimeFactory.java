package project_euler.math.prime;


public class PrimeFactory {
    private final PrimeCheck check;
    private PrimeRepository repository;
    private Long currentPrime = 1L;
    private boolean fromCache;

    public PrimeFactory(PrimeCheck check, PrimeRepository repository) {
        this.check = check;
        this.repository = repository;
        fromCache = true;
    }

    public Long next() {
        if (fromCache) {
            Long nextPrime = repository.next();
            if (nextPrime != null) {
                currentPrime = nextPrime;
            } else {
                fromCache = false;
                currentPrime = repository.last();
            }
        }

        if (!fromCache) {
            do {
                currentPrime++;
            } while (!check.isPrime(currentPrime));
            repository.add(currentPrime);
        }
        return currentPrime;
    }

    public void reset() {
        repository.resetIteration();
        currentPrime = 1L;
    }
}
