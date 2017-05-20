package project_euler.problems;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Problem018Test {
    private Problem018 problem;

    @Before
    public void setup() {
        problem = new Problem018();
    }

    @Test
    public void smallPyramid() {
        List<List<Integer>> pyramid = new ArrayList<>();
        pyramid.add(Collections.singletonList(3));
        pyramid.add(Arrays.asList(7, 4));
        pyramid.add(Arrays.asList(2, 4, 6));
        pyramid.add(Arrays.asList(8, 5, 9, 3));
        assertEquals(23, problem.calculate(pyramid));
    }

    @Test
    public void solution() {
        assertEquals(1074, problem.execute());
    }
}
