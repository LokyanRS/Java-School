package com.lokyanrs.javaschool.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyList<T> extends ArrayList<T> {
    @Override
    public Iterator<T> iterator() {
        return new ReverseIterator<>(this);
    }

    public MyList(Collection<? extends T> c) {
        super(c);
    }
}
