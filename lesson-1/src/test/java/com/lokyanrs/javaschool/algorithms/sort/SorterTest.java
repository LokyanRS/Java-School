package com.lokyanrs.javaschool.algorithms.sort;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.*;

public class SorterTest {
    private List<Integer> list;

    @BeforeMethod
    public void setUp() {
        list = Arrays.asList(5, 4, 3, 2, 1, 0, -1);
    }

    @Test
    public void bubbleSortTest() {
        checkSort(new BubbleSorter(), list);
    }

    @Test
    public void quickSortTest() {
        checkSort(new QuickSorter(), list);
    }

    private <T extends Comparable<T>> void checkSort(Sorter sorter, List<T> actualList) {
        List<T> expectedList = new ArrayList<>(actualList);
        Collections.sort(expectedList);
        sorter.sort(actualList);

        Assert.assertEquals(actualList, expectedList);
    }
}
