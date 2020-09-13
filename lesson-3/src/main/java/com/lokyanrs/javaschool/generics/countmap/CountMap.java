package com.lokyanrs.javaschool.generics.countmap;

import java.util.Map;

/**
 * Контейнер, который хранит количество добавлений элементов T
 * @param <T>
 */
public interface CountMap<T> {
    /**
     * Добавление элемента в контейнер
     */
    void add(T element);

    /**
     * Возвращает количество добавление данного элемента
     * @param element элемент
     * @return количество добавлений
     */
    int getCount(T element);

    /**
     * Удаляет элемент из контейнера и возвращает количество его добавлений
     * @param element элемент
     * @return количество добавлений до удаления
     */
    int remove(T element);

    /**
     * Возвращает количество различных элементов
     */
    int size();

    /**
     * Добавить все элементы из source в текущий контейнер. При совпадении ключей суммировать значения
     * @param source контейнер, элементы которого необходимо добавить
     */
    void addAll(CountMap<T> source);

    /**
     * Получить текущий контейнер в виде Map, где ключ - элемент, значение - количество добавлений
     */
    Map<T, Integer> toMap();

    /**
     * Сохранить текущий конейнер destination, аналогично {@link #toMap()}}
     */
    void toMap(Map<T, Integer> destination);
}
