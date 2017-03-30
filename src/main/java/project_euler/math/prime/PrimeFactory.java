package project_euler.math.prime;


public class PrimeFactory {
    private final PrimeCheck check;
    private Long currentPrime = 1L;

    public PrimeFactory(PrimeCheck check) {
        this.check = check;
    }

    public Long next() {
        do {
            currentPrime++;
        } while(!check.isPrime(currentPrime));
        return currentPrime;
    }

    public void reset() {
        currentPrime = 1L;
    }
}
