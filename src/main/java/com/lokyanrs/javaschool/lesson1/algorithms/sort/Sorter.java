package com.lokyanrs.javaschool.lesson1.algorithms.sort;

import java.util.List;

public interface Sorter {
    <T extends Comparable<T>> void  sort(List<T> list);
}
