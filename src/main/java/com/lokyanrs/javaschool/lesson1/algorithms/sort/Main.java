package com.lokyanrs.javaschool.lesson1.algorithms.sort;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1, 0, -1);
        sort(new QuickSorter(), list);
    }

    private static <T extends Comparable<T>> void sort(Sorter sorter, List<T>list){
        sorter.sort(list);
        for (T t : list) {
            System.out.print(t + " ");
        }
    }
}
