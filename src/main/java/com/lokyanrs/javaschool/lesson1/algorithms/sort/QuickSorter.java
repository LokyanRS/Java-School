package com.lokyanrs.javaschool.lesson1.algorithms.sort;

import java.util.List;

public class QuickSorter implements Sorter {
    public <T extends Comparable<T>> void sort(List<T> list) {
        doSort(list, 0, list.size() - 1);
    }

    private <T extends Comparable<T>> void doSort(List<T> list, int leftIndex, int rightIndex) {
        T middleElement = list.get((leftIndex + rightIndex) / 2);
        int leftMarker = leftIndex;
        int rightMarker = rightIndex;

        while (leftMarker <= rightMarker) {
            while (list.get(leftMarker).compareTo(middleElement) < 0)
                leftMarker++;
            while (list.get(rightMarker).compareTo(middleElement) > 0)
                rightMarker--;
            if (leftMarker <= rightMarker) {
                T temp = list.get(leftMarker);
                list.set(leftMarker, list.get(rightMarker));
                list.set(rightMarker, temp);
                leftMarker++;
                rightMarker--;
            }
        }
        if (leftMarker < rightIndex)
            doSort(list, leftMarker, rightIndex);
        if (rightMarker > leftIndex)
            doSort(list, leftIndex, rightMarker);
    }
}
