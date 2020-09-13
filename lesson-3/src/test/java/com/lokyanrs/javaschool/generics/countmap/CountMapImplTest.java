package com.lokyanrs.javaschool.generics.countmap;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;

public class CountMapImplTest {
    private CountMap<Integer> countMap;

    @BeforeMethod
    public void setUp() {
        countMap = new CountMapImpl<>();
        countMap.add(10);
        countMap.add(10);
        countMap.add(5);
        countMap.add(6);
        countMap.add(5);
        countMap.add(10);
    }

    @Test
    public void testGetCount() {
        Assert.assertEquals(countMap.getCount(5), 2);
        Assert.assertEquals(countMap.getCount(6), 1);
        Assert.assertEquals(countMap.getCount(10), 3);
    }

    @Test
    public void testRemove() {
        Assert.assertEquals(countMap.remove(5), 2);
        Assert.assertEquals(countMap.remove(6), 1);
        Assert.assertEquals(countMap.remove(10), 3);

        Assert.assertEquals(countMap.getCount(5), 0);
        Assert.assertEquals(countMap.getCount(6), 0);
        Assert.assertEquals(countMap.getCount(10), 0);
    }

    @Test
    public void testSize() {
        Assert.assertEquals(countMap.size(), 3);
    }

    @Test
    public void testAddAll() {
        CountMap<Integer> countMap2 = new CountMapImpl<>();
        countMap2.add(10);
        countMap2.add(100);

        countMap.addAll(countMap2);
        Assert.assertEquals(countMap.getCount(5), 2);
        Assert.assertEquals(countMap.getCount(6), 1);
        Assert.assertEquals(countMap.getCount(10), 4);
        Assert.assertEquals(countMap.getCount(100), 1);
    }

    @Test
    public void testToMap() {
        Map<Integer, Integer> countMap2 = countMap.toMap();
        Assert.assertEquals(countMap2.get(5).intValue(), 2);
        Assert.assertEquals(countMap2.get(6).intValue(), 1);
        Assert.assertEquals(countMap2.get(10).intValue(), 3);

        countMap.toMap(countMap2);

        Assert.assertEquals(countMap2.get(5).intValue(), 2);
        Assert.assertEquals(countMap2.get(6).intValue(), 1);
        Assert.assertEquals(countMap2.get(10).intValue(), 3);
    }
}