package com.lokyanrs.javaschool.calculator;

import com.lokyanrs.javaschool.reflection.proxy.cache.Cache;
import com.lokyanrs.javaschool.reflection.proxy.metric.Metric;

public interface Calculator {
    /**
     * Расчет факториала числа
     * @param number число
     */
    @Cache
    @Metric
    int calc (int number);
}
