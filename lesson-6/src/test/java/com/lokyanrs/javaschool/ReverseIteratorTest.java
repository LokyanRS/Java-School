package com.lokyanrs.javaschool;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class ReverseIteratorTest {

    @BeforeMethod
    public void beforeClass() {

    }

    @Test
    public <T> void emptyHasNextTest() {
        Iterator<T> iterator = new ReverseIterator<>(new ArrayList<>());
        Assert.assertFalse(iterator.hasNext());
    }

    @Test
    public <T> void emptyNextTest() {
        Iterator<T> iterator = new ReverseIterator<>(new ArrayList<>());
        Assert.assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    public void oneElementHasNextTest() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        Iterator<String> iterator = new ReverseIterator<>(list);
        Assert.assertTrue(iterator.hasNext());
    }

    @Test
    public void oneElementNextTest() {
        List<String> list = new ArrayList<>();
        list.add("hello");
        Iterator<String> iterator = new ReverseIterator<>(list);
        Assert.assertTrue(iterator.hasNext());
        iterator.next();
        Assert.assertFalse(iterator.hasNext());
        Assert.assertThrows(NoSuchElementException.class, iterator::next);
    }

    @Test
    public void elementOrderTest() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Iterator<Integer> iterator = new ReverseIterator<>(list);

        Assert.assertEquals((int)iterator.next(), 3);
        Assert.assertEquals((int)iterator.next(), 2);
        Assert.assertEquals((int)iterator.next(), 1);
    }
}
