package project_euler.problems;

import project_euler.di.ProblemDi;
import project_euler.math.Combinatorics;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 */
public class Problem015 extends ProblemDi {

    public long execute() {
        return calculate(20);
    }

    public long calculate(int size) {
        Combinatorics combinatorics = injector.getInstance(Combinatorics.class);
        return combinatorics.binominalCoefficient(2 * size, size);
    }
}
