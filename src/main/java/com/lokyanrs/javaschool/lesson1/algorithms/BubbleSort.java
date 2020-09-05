package com.lokyanrs.javaschool.lesson1.algorithms;

import java.util.*;

public class BubbleSort {
    public static <T extends Comparable<T>> void sort(List<T> list) {
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

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1, 0, -1);
        sort(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}