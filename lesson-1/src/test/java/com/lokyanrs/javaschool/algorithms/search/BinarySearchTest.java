package com.lokyanrs.javaschool.algorithms.search;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;


public class BinarySearchTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(BinarySearchTest.class);

    @Test
    public void testSearch() {
        List<Integer> list = Arrays.asList(-5, 1, 2, 5, 7, 9, 22, 56, 80, 99, 106, 130, 170, 171, 200, 205, 206, 245);

        int elementToFind = -5;
        Assert.assertEquals(BinarySearch.search(list, elementToFind), list.indexOf(elementToFind));

        elementToFind = 106;
        Assert.assertEquals(BinarySearch.search(list, elementToFind), list.indexOf(elementToFind));

        elementToFind = 245;
        Assert.assertEquals(BinarySearch.search(list, elementToFind), list.indexOf(elementToFind));
    }
}