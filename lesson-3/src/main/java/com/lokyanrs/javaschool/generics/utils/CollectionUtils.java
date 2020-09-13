package com.lokyanrs.javaschool.generics.utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * PECS
 */
public class CollectionUtils {

    private CollectionUtils() {
        throw new UnsupportedOperationException("Oops!");
    }

    public static <T> void addAll(List<? extends T> source, List<? super T> destination) {
        destination.addAll(source);
    }

    public static <T> List<T> newArrayList(List<? extends T> source) {
        return new ArrayList<>(source);
    }

    public static int indexOf(List<?> source, Object o) {
        return source.indexOf(o);
    }

    public static <T> List<T> limit(List<? extends T> source, int size) {
        return source.stream().limit(size).collect(Collectors.toList());
    }

    public static <T> void add(List<? super T> source, T o) {
        source.add(o);
    }

    public static <T> void removeAll(List<? super T> removeFrom, List<? extends T> c2) {
        removeFrom.removeAll(c2);
    }

    public static <T> boolean containsAll(List<? super T> c1, List<? extends T> c2) {
        return c1.containsAll(c2);
    }

    public static <T> boolean containsAny(List<? super T> c1, List<? extends T> c2) {
        for (T element : c2)
            if (c1.contains(element))
                return true;
        return false;
    }

    public static <T extends Comparable<T>> List<T> range(List<? extends T> list, T min, T max) {
        List<T> resultList = newArrayList(list);
        for (T element : list) {
            if (element.compareTo(min)>=0 && element.compareTo(max)<=0)
                resultList.add(element);
        }
        return resultList;
    }

    public static <T>List<T> range(List<? extends T> list, T min, T max, Comparator<? super T> comparator) {
        List<T> resultList = newArrayList(list);
        for (T element : list) {
            if (comparator.compare(element, min)>=0 && comparator.compare(element, max)<=0)
                resultList.add(element);
        }
        return resultList;
    }

}
