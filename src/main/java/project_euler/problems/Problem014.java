package project_euler.problems;


import java.util.ArrayList;
import java.util.List;

/**
 * The following iterative sequence is defined for the set of positive integers:
 *
 * n -> n/2 (n is even)
 * n -> 3n + 1 (n is odd)
 *
 * Using the rule above and starting with 13, we generate the following sequence:
 *
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 *
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
 * Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
 *
 * Which starting number, under one million, produces the longest chain?
 *
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 */
public class Problem014 {
    public long execute() {
        return calculate(999999);
    }

    public long calculate(long upperLimit) {
        int maxLength = 0;
        long start = upperLimit;
        for (long i = upperLimit; i > 1; i--) {
            int length = collatzChan(i).size();
            if (length > maxLength) {
                maxLength = length;
                start = i;
            }
        }
        return start;
    }

    private static List<Long> collatzChan(long number) {
        List<Long> list = new ArrayList<>();

        while(number > 1) {
            list.add(number);

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = 3 * number + 1;
            }
        }
        list.add(1L);

        return list;
    }
}
