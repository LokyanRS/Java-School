package com.lokyanrs.javaschool.generics.countmap;

import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<T> implements CountMap<T> {
    private final HashMap<T, Integer> elements;

    public CountMapImpl() {
        elements = new HashMap<>();
    }

    @Override
    public void add(T element) {
        elements.put(element,
                elements.getOrDefault(element, 0) + 1);
    }

    @Override
    public int getCount(T element) {
        return elements.getOrDefault(element, 0);
    }

    @Override
    public int remove(T element) {
        int count = getCount(element);
        elements.remove(element);
        return count;
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public void addAll(CountMap<T> source) {
        for (T element : source.toMap().keySet()) {
            elements.put(element, source.getCount(element) + getCount(element));
        }
    }

    @Override
    public Map<T, Integer> toMap() {
        return (Map<T, Integer>) elements.clone();
    }

    @Override
    public void toMap(Map<T, Integer> destination) {
        destination.clear();
        destination.putAll(elements);
    }
}
