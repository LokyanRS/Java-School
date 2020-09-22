package com.lokyanrs.javaschool;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ReverseIteratorTest {

    @BeforeClass
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
}
