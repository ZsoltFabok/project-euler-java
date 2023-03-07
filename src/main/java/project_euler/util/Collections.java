package project_euler.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Collections {
    private Collections() {
    }

    public static <T> List<T> subList(List<T> list, int fromIndex, int toIndex) {
        return list.subList(fromIndex, toIndex);
    }

    public static <T> List<T> sort(List<T> list) {
        return list.stream().sorted().toList();
    }

    public static <T> List<T> append(List<T> list, T number) {
        List<T> newList = new ArrayList<>(list);
        newList.add(number);
        return newList;
    }

    public static <T> List<T> append(T number, List<T> list) {
        List<T> newList = new ArrayList<>(list);
        newList.add(0, number);
        return newList;
    }

    public static List<Integer> toIntegerList(String content) {
        return Arrays.stream(content.split(" ")).map(Integer::parseInt).toList();
    }
}
