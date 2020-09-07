package com.lokyanrs.javaschool.lesson1.algorithms.sort;

import java.util.*;

public class BubbleSorter implements Sorter {
    @Override
    public <T extends Comparable<T>> void sort(List<T> list) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i + 1).compareTo(list.get(i)) < 0) {
                    T savedValue = list.get(i + 1);
                    list.set(i + 1, list.get(i));
                    list.set(i, savedValue);
                    swapped = true;
                }
            }
        }
        while (swapped);
    }
}