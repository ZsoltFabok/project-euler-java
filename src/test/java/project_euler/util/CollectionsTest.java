package project_euler.util;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static project_euler.util.Collections.append;
import static project_euler.util.Collections.sort;
import static project_euler.util.Collections.subList;
import static project_euler.util.Collections.toIntegerList;

public class CollectionsTest {

    @Test
    public void subListWorks() {
        List<Integer> list = Arrays.asList(1, 3, 3);
        List<Integer> result = subList(list, 0, 1);
        assertEquals(Integer.valueOf(1), result.get(0));
    }

    @Test
    public void sortWorks() {
        List<Integer> list = Arrays.asList(1, 5, 3);
        assertEquals(Arrays.asList(1, 3, 5), sort(list));
    }

    @Test
    public void appendWorks() {
        List<Integer> list = java.util.Collections.singletonList(1);
        assertEquals(Arrays.asList(1, 2), append(list, 2));
    }

    @Test
    public void appendWorksTheOtherWay() {
        List<Integer> list = java.util.Collections.singletonList(1);
        assertEquals(Arrays.asList(2, 1), append(2, list));
    }

    @Test
    public void toIntegerListWorks() {
        assertEquals(Arrays.asList(1, 2, 3), toIntegerList("01 2 3"));
    }
}
