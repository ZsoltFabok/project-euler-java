package project_euler.problems;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 *
 * a^2 + b^2 = c^2
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product a*b*c
 */
public class Problem009 {
    public long execute() {
        return calculate(1000);
    }

    /** maybe I could optimize this method, but it reads fine and finishes under 0.5 second */
    public long calculate(int sumOfTriplet) {
        int a = 1;
        int b = a + 1;
        int c = sumOfTriplet - a - b;
        while (!isPythagoreanTriplet(a, b, c)) {
            if (b == sumOfTriplet - 1) {
                a += 1;
                b = a + 1;
            } else {
                b += 1;
            }
            c = sumOfTriplet - a - b;
        }
        return a * b * c;
    }

    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        return a * a + b * b == c * c;
    }
}