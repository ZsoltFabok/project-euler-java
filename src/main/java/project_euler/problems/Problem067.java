package project_euler.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below,
 * the maximum total from top to bottom is 23.
 *
 *    3
 *   7 4
 *  2 4 6
 * 8 5 9 3
 *
 * That is, 3 + 7 + 4 + 9 = 23.
 *
 * Find the maximum total from top to bottom of the triangle in the data set.
 */
public class Problem067 {
    public long execute() {
        return calculate(loadPyramid());
    }

    public int calculate(List<List<Integer>> pyramid) {
        return mergeBottomLineOneLevelUp(pyramid).get(0).get(0);
    }

    /**
     * This method takes the bottom of the pyramid and moves the values from it
     * one level up. For example, in case of
     *    3
     *   7 4
     *  2 4 6
     *
     *  It get the max of (2, 4) and adds to 7. Then it takes the max(4, 6) and adds to 4
     *
     *  The new pyramid:
     *
     *     3
     *   11 10
     *
     *   after recursion the tip will has the value we are looking for.
     */
    private static List<List<Integer>> mergeBottomLineOneLevelUp(List<List<Integer>> pyramid) {
        if (pyramid.size() > 1) {
            List<List<Integer>> reducedPyramid = clone(pyramid);
            List<Integer> bottom = reducedPyramid.remove(reducedPyramid.size() - 1);
            for (int i = 0; i < last(reducedPyramid).size(); i++) {
                int max = max(bottom.get(i), bottom.get(i + 1));
                addTo(reducedPyramid.get(reducedPyramid.size() - 1), i, max);
            }
            return mergeBottomLineOneLevelUp(reducedPyramid);
        }

        return pyramid;
    }

    private static int max(int first, int second) {
        if (first > second) {
            return first;
        }
        return second;
    }

    private static void addTo(List<Integer> line, int index, int value) {
        line.set(index, line.get(index) + value);
    }

    private static List<Integer> last(List<List<Integer>> pyramid) {
        return pyramid.get(pyramid.size() - 1);
    }

    private static List<List<Integer>> clone(List<List<Integer>> other) {
        List<List<Integer>> newList = new ArrayList<>();
        for (List<Integer> l : other) {
            List<Integer> newEntry = new ArrayList<>();
            newList.add(newEntry);
            newEntry.addAll(l);
        }
        return newList;
    }

    private static List<List<Integer>> loadPyramid() {
        List<List<Integer>> pyramid = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/problem067.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                List<Integer> level = Arrays.stream(line.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                pyramid.add(level);

            }
        } catch (IOException exception) {
            // unable to read data file, let the content be empty
        }

        return pyramid;
    }

}
