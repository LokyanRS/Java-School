package com.lokyanrs.javaschool;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class  MyIterator<T> implements Iterator<T> {
    private final List<T> list;
    private int lastReturned = -1; // Ни разу не обращались

    public MyIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return lastReturned != 0;
    }

    @Override
    public T next() {
        switch (lastReturned) {
            case 0:
                throw new NoSuchElementException("Достигнут конец коллеции");
            case -1:
                lastReturned = list.size() - 1;
                return list.get(lastReturned);
            default:
                lastReturned -= 1;
                return list.get(lastReturned);
        }
    }
}
