package project_euler.math;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CombinationTest {
    private Combination combination;
    private List<Long> numbers;

    @BeforeEach
    public void setup() {
        combination = new Combination();
        numbers = Arrays.asList(2L, 3L, 3L, 7L);
    }

    @Test
    public void getWithOne() {
        List<List<Long>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(2L));
        expected.add(Collections.singletonList(3L));
        expected.add(Collections.singletonList(7L));

        assertEquals(expected, combination.get(numbers, 1));
    }

    @Test
    public void getWithTwo() {
        List<List<Long>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3L, 3L));
        expected.add(Arrays.asList(2L, 3L));
        expected.add(Arrays.asList(3L, 7L));
        expected.add(Arrays.asList(2L, 7L));

        assertEquals(expected, combination.get(numbers, 2));
    }

    @Test
    public void getWithThree() {
        List<List<Long>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2L, 3L, 3L));
        expected.add(Arrays.asList(2L, 3L, 7L));
        expected.add(Arrays.asList(3L, 3L, 7L));

        assertEquals(expected, combination.get(numbers, 3));
    }

    @Test
    public void getWithFour() {
        List<List<Long>> expected = new ArrayList<>();
        expected.add(Arrays.asList(2L, 3L, 3L, 7L));

        assertEquals(expected, combination.get(numbers, 4));
    }

    @Test
    public void getAll() {
        List<List<Long>> expected = new ArrayList<>();
        expected.add(Collections.singletonList(2L));
        expected.add(Collections.singletonList(3L));
        expected.add(Collections.singletonList(7L));
        expected.add(Arrays.asList(3L, 3L));
        expected.add(Arrays.asList(2L, 3L));
        expected.add(Arrays.asList(3L, 7L));
        expected.add(Arrays.asList(2L, 7L));
        expected.add(Arrays.asList(2L, 3L, 3L));
        expected.add(Arrays.asList(2L, 3L, 7L));
        expected.add(Arrays.asList(3L, 3L, 7L));
        expected.add(Arrays.asList(2L, 3L, 3L, 7L));

        assertEquals(expected, combination.get(numbers));
    }
}
