package com.lokyanrs.javaschool.algorithms.search;

import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.NoSuchElementException;

public class BinarySearch {

    private BinarySearch() {
        throw new UnsupportedOperationException("Oops");
    }

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BinarySearch.class);

    public static <T extends Comparable<T>> int search(List<T> list, T elementToFind) {
        LOGGER.info("Ищем элемент {}", elementToFind);
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
}