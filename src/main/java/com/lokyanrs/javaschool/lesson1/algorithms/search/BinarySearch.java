package com.lokyanrs.javaschool.lesson1.algorithms.search;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class BinarySearch {
    private static final String ACTUAL_INDEX = "Actual index = ";
    private static final String EXPECTED_INDEX = "Expected index = ";

    public static <T extends Comparable<T>> int search(List<T> list, T elementToFind) {
        return find(list, elementToFind, 0, list.size());
    }

    private static <T extends Comparable<T>> int find(List<T> list, T elementToFind, int firstIndex, int lastIndex) {
        int middleIndex = (firstIndex + lastIndex) / 2;

        int compared = list.get(middleIndex).compareTo(elementToFind);

        if (compared == 0)
            return middleIndex;
        if (middleIndex == 0)
            throw new NoSuchElementException("В отсортированном списке отсутсвует искомый элемент");
        if (compared > 0)
            return find(list, elementToFind, firstIndex, middleIndex);
        return find(list, elementToFind, middleIndex, lastIndex);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-5, 1, 2, 5, 7, 9, 22, 56, 80, 99, 106, 130, 170, 171, 200, 205, 206, 245);

        int elementToFind = -5;
        System.out.println(ACTUAL_INDEX + search(list, elementToFind));
        System.out.println(EXPECTED_INDEX + list.indexOf(elementToFind));

        elementToFind = 106;
        System.out.println(ACTUAL_INDEX + search(list, elementToFind));
        System.out.println(EXPECTED_INDEX + list.indexOf(elementToFind));

        elementToFind = 245;
        System.out.println(ACTUAL_INDEX + search(list, elementToFind));
        System.out.println(EXPECTED_INDEX + list.indexOf(elementToFind));
    }
}