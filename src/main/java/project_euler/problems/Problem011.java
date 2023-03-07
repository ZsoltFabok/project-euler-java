package project_euler.problems;

import project_euler.util.DataFile;

import java.util.ArrayList;
import java.util.List;

public class Problem011 {
    public long execute() {
        return calculate(4);
    }

    @SuppressWarnings({"java:S3776"})
    public long calculate(int numberOfDigits) {
        List<List<Integer>> data = new DataFile().loadNumbers("problem011");

        long max = 0;
        for (int i = 0; i < data.size(); i++) {
            for (int j = 0; j < data.get(i).size(); j++) {
                // try horizontal
                if (j < data.get(i).size() - numberOfDigits + 1) {
                    max = Math.max(max, productOfDigits(horizontal(data, i, j, numberOfDigits)));
                }

                // try vertical
                if (i < data.size() - numberOfDigits + 1) {
                    max = Math.max(max, productOfDigits(vertical(data, i, j, numberOfDigits)));
                }

                // try diagonal - down to the right
                if ((i < data.size() - numberOfDigits + 1) && (j < data.get(i).size() - numberOfDigits + 1)) {
                    max = Math.max(max, productOfDigits(diagonalRightDown(data, i, j, numberOfDigits)));
                }

                // try diagonal - down to the left
                if ((i < data.size() - numberOfDigits + 1) && (j >= numberOfDigits - 1)) {
                    max = Math.max(max, productOfDigits(diagonalLeftDown(data, i, j, numberOfDigits)));
                }
            }
        }

        return max;
    }

    private static List<Integer> horizontal(List<List<Integer>> data, int i, int j, int numberOfDigits) {
       return data.get(i).subList(j, j + numberOfDigits);
    }

    private static List<Integer> vertical(List<List<Integer>> data, int i, int j, int numberOfDigits) {
        List<Integer> l = new ArrayList<>();
        for (int k = 0; k < numberOfDigits; k++) {
            l.add(data.get(i + k).get(j));
        }
        return l;
    }

    /**
     * A (i, j)
     *   B
     *     C
     *        D
     */
    private static List<Integer> diagonalRightDown(List<List<Integer>> data, int i, int j, int numberOfDigits) {
        List<Integer> l = new ArrayList<>();
        for (int k = 0; k < numberOfDigits; k++) {
            l.add(data.get(i + k).get(j + k));
        }
        return l;
    }

    /**
     *       A (i, j)
     *     B
     *   C
     * D
     */
    private static List<Integer> diagonalLeftDown(List<List<Integer>> data, int i, int j, int numberOfDigits) {
        List<Integer> l = new ArrayList<>();
        for (int k = 0; k < numberOfDigits; k++) {
            l.add(data.get(i + k).get(j - k));
        }
        return l;
    }

    private long productOfDigits(List<Integer> subList) {
        return subList.stream().reduce(1, (a, b) -> a * b);
    }
}
