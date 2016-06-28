package project_euler.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 *
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 *
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem002 {
    public int execute() {
        return calculate(4000000);
    }

    int calculate(int limit) {
        return fibonacci(limit).stream().mapToInt(n -> n).filter(n -> n % 2 == 0).sum();
    }

    private List<Integer> fibonacci(int limit) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        while(list.get(list.size()-1) < limit) {
            list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
        }
        return list;
    }
}
