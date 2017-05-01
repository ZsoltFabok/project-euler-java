package project_euler.math;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static project_euler.util.Collections.append;
import static project_euler.util.Collections.subList;

public class Combination {
    public List<List<Long>> get(List<Long> numbers, int n) {
        return new ArrayList<>(internal(new ArrayList<>(), new ArrayList<>(numbers), n));
    }

    public List<List<Long>> get(List<Long> numbers) {
        List<List<Long>> result = new ArrayList<>();

        for (int i = 1; i <= numbers.size(); i++) {
            result.addAll(internal(new ArrayList<>(), new ArrayList<>(numbers), i));
        }
        return result;
    }

    private static Set<List<Long>> internal(List<Long> sofar, List<Long> rest, int n) {
        Set<List<Long>> result = new HashSet<>();
        if (n == 0) {
            result.add(sofar);
        } else {
            for (int i = 0; i < rest.size(); i++) {
                result.addAll(internal(append(sofar, rest.get(i)), subList(rest, i + 1, rest.size()), n - 1));
            }
        }

        return result;
    }
}
