package project_euler.problems;

/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 *
 * How many such routes are there through a 20×20 grid?
 */
public class Problem015 {
    public long execute() {
        return calculate(20);
    }

    public long calculate(int size) {
        return walk(0, 0, size);
    }

    private static int walk(int x, int y, int size) {
        if (x == size || y == size) {
            return 1;
        }

        return walk(x + 1, y, size) + walk(x, y + 1, size);
    }
}
