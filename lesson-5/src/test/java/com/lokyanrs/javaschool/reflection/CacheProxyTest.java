package com.lokyanrs.javaschool.reflection;

import com.lokyanrs.javaschool.calculator.Calculator;
import com.lokyanrs.javaschool.calculator.CalculatorImpl;
import com.lokyanrs.javaschool.reflection.proxy.cache.CacheProxy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class CacheProxyTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(CacheProxy.class);

    @Test
    public void cacheProxyTest() {
        Calculator proxyCalculator = CacheProxy.newProxyFactory(new CalculatorImpl());
        proxyCalculator.calc(1);
        proxyCalculator.calc(10);
        proxyCalculator.calc(15);
        proxyCalculator.calc(20);
        proxyCalculator.calc(1);
        proxyCalculator.calc(10);
        proxyCalculator.calc(10);
    }
}
